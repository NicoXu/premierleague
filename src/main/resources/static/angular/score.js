/**
 * Created by shaw on 2018/1/1.
 */
$(function () {

    function query() {
        $.ajax({
            type: "post",
            url: "/premierleague/getScoreList",
            dataType: "json",
            success: function (data) {
                var tbody = $("#scoreTbody");
                var arrStr = [];
                var eData = data.list;
                if (eData){
                    for (var i=0;i<eData.length;i++) {
                        arrStr.push("<tr>");
                        arrStr.push("<td style='display:none'>" + eData[i].scoreId+"</td>")
                        arrStr.push("<td>" + eData[i].teamId+ "</td>");
                        arrStr.push("<td>" + eData[i].teamName + "</td>");
                        arrStr.push("<td>" + eData[i].score + "</td>");
                        arrStr.push("<td>" + "<button class='cancelBtn'>删除</button>"+"</td>");
                        arrStr.push("</tr>");
                    }
                    tbody.html(arrStr.join(""));
                }
            }
        });
    }

    query();

    $("#scoreTbody").on('click','.cancelBtn',function () {
        var xx = $(this);
        console.log(xx.parent().siblings().eq(0).text());
        var id = $(this).parent().siblings().eq(0).text();
        $("#cancelModal").modal({});
        $("#cancelModalBtn").on('click',function () {
            $.ajax({
                type: "post",
                url: "/premierleague/deleteScoreById",
                dataType: "json",
                data: {scoreId : id},
                success: function () {
                    query();
                    $("#cancelModal").modal('hide');
                }
            });
        });
    });
})
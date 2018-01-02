/**
 * Created by shaw on 2018/1/1.
 */
$(function () {
    $.ajax({
        type: "post",
        url: "/premierleague/getScoreList",
        dataType: "json",
        success: function (data) {
            console.log("heloo");
            var tbody = $("#scoreTbody");
            var arrStr = [];
            var eData = data.list;
            console.log(data);
            console.log(JSON.stringify(eData));
            if (eData){
                for (var i=0;i<eData.length;i++) {
                    arrStr.push("<tr>");
                    arrStr.push("<td>" + eData[i].teamId+ "</td>");
                    arrStr.push("<td>" + eData[i].teamName + "</td>");
                    arrStr.push("<td>" + eData[i].score + "</td>");
                    arrStr.push("</tr>");
                }
                tbody.html(arrStr.join(""));
            }
        }
    });
})
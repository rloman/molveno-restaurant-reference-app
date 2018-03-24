var counter = 10;

$(document).ready(function() {
    $("#progressButton").click(function() {
        counter += 10;
        counter = counter >100 ? 100 : counter;
        $("#progressBar").html(""+counter+"%");
        $("#progressBar").css("width", ""+counter+"%");
    });

      $("#delayButton").click(function() {
            counter -= 10;
            counter = counter < 0 ? 0 : counter;
            $("#progressBar").html(""+counter+"%");
            $("#progressBar").css("width", ""+counter+"%");
        });
});
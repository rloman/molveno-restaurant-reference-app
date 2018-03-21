//$(document).ready(started);

// instead of started .. and mostly done ...

$(document).ready(function() {
     console.log("Ready ... page loaded");

     $("#testButton").click(function() { // register (more the jQuery way) the function (event handler) to the button
        $("#test").hide();
     });
});

function started() {
      console.log("Ready ... page loaded");
}

function hideSome() {

$("p").hide();

}

function hideAllParagraphsWithIntroOrSlot() {

    $("p.intro").hide();
    $("p.slot").hide();

}

function showAll() {
    $("p").show();
}

function toggleEpilog() {
    $("#epilog").toggle();
}


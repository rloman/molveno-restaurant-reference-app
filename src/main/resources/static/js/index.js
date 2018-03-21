//$(document).ready(started);

// instead of started .. and mostly done ...

var baseUrl = "http://localhost:8080/api"

$(document).ready(function() {
     console.log("Ready ... page loaded");

     $("#testButton").click(function() { // register (more the jQuery way) the function (event handler) to the button
        $("#test").hide();
     });

     $("#updateButton").click(function() {
        $.ajax({
                // waar moet hij de request op uitvoeren
                url : "http://localhost:8080/api/persons",
                // type actie
                type : "get",
                // als de actie lukt, voer deze functie uit
                success: function(data){ // so the data is the bulb of the response of the Spring Boot REST controller

                	guestList = "";

                	$.each(data, function(index, current){ // index (the index starting from 0, current: the current object of the iterable

                		guestList += createQuestString(current);

                	});

                	$("#guestList").html(guestList);
                }
            });


     });
});

function started() {
      console.log("Ready ... page loaded");
}

function hideSome() {

$("p").hide();

}

function createQuestString(quest) {
 result = "<tr><td>"+quest.firstName+"</td><td>"+quest.lastName+"</td><td>"+quest.yearOfBirth+"</td></tr>";//composeGuestString(current);

  return result;
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


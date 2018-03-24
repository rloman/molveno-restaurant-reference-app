$(document).ready(function() {
    $('#guestTable').DataTable( {
        "order": [[ 2, "asc" ]],
        "ajax": {
                url: 'http://localhost:8080/api/persons',
                dataSrc: ''
            },
        "columns": [
            { "data": "lastName" },
            { "data": "firstName" },
            { "data": "yearOfBirth" }
        ]
    } );
    // Functionality for interaction when clicking on rows of the table
        $('#guestTable tbody').on( 'click', 'tr', function () {
            if ( $(this).hasClass('selected') ) {
                $(this).removeClass('selected');
            }
            else {
                deselect();
                $(this).addClass('selected');
                var table = $('#guestTable').DataTable();
                var data = table.row(this).data();
                apiGetSingleGuest(data.id);
                $('#myModal').modal('toggle');
            }
        });

} );

// Get the data of a guest using an id
function apiGetSingleGuest(id){
    var api = "http://localhost:8080/api/persons/" + id;
    $.get(api, function(data){
        if (data){
            fillUpdateDiv(data);
        }
    });
}

// Fill the form with guestdata when updating the guest
function fillUpdateDiv(guest){

    console.log(guest);
    if(true) {
        return; // for now rloman, later we will have the modal working
    }
    $("#btndelete").attr('onclick', 'submitDelete(' + guest.guestNumber + ');');
    $("#btnsubmit").attr('onclick', 'submitEdit(' + guest.guestNumber + ');');
    document.getElementById("modal-title").innerHTML="Edit Guest";
    $("#firstName").val(guest.firstName);
    $("#surName").val(guest.surName);
    $("#address").val(guest.address);
    $("#postalCode").val(guest.postalCode);
    $("#city").val(guest.city);
    $("#country").val(guest.country);
    $("#phoneNumber").val(guest.phoneNumber);
    $("#mailAddress").val(guest.mailAddress);
    $("#confirmbutton").css('display', 'inline-block');
    deleteID = guest.guestNumber;
    var elem = '<button type="button" class="btn btn-danger" onclick="submitDelete();">Confirm delete</button>';
    $('#confirmbutton').popover({
        animation:true,
        content:elem,
        html:true,
        container: myModal
    });
}

// Deselect all items in the table
function deselect(){
    $('#guestTable tr.selected').removeClass('selected');
    // rloman dit moet straks terug. ik denk dat dit het modal form is
//    document.getElementById("guestForm").reset();
}
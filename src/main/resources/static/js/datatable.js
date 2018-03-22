$(document).ready(function() {
    $('#example').DataTable( {
        ajax: {
                url: 'http://localhost:8080/api/persons',
                dataSrc: ''
            },
        "columns": [
            { "data": "lastName" },
            { "data": "firstName" },
            { "data": "yearOfBirth" }
        ]
    } );
} );
$(document).ready(function() {
    $('#example').DataTable( {
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
} );
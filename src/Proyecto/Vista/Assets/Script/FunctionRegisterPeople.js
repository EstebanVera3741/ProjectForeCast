$(document).ready(function(){
    $('#fecha3').datepicker({
        format: 'dd/mm/yyyy',
        language: 'es',
        todayHighlight: true,
        autoclose: true
    });
});

$(document).ready(function(){
    $('#fecha4').datepicker({
        format: 'yyyy',
        language: 'es',
        todayHighlight: true,
        autoclose: true
    });
});
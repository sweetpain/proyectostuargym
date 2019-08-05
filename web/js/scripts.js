
// JavaScript Document


$(document).ready(function () {
   // alert('texto');
    //JQUEY VALIDATOR
    jQuery.validator.setDefaults({
        highlight: function (element) {
            $(element).closest('.form-group').removeClass('has-success').addClass('has-error');
        },
        unhighlight: function (element) {
            $(element).closest('.form-group').removeClass('has-error').addClass('has-success');
        },
        errorElement: 'span',
        errorClass: 'help-block',
        errorPlacement: function (error, element) {
            if (element.parent('.input-group').length) {
                error.insertAfter(element.parent());
            } else {
                error.insertAfter(element);
            }
        }
    });

    //PARA VALIDAR QUE SOLO ADMITA LETRAS
    jQuery.validator.addMethod("onlyText", function (value, element) {
        var input = /^\s*[a-zA-Z,\s]+\s*$/;
        return this.optional(element) || input.test(value);
    }, "Esta Campo solamente acepta texto.");



    //REGISTRAR GASTO					
    $(document).on('click', '.registrar_gasto', function () {
        //$('.registro-nuevo-usuario').click( function(){
        //console.log("ingreso");
        consulta('frmGasto.jsp', {}, function (result) {
            $('.contenido').load('frmGasto.jsp');
            console.log("ingreso");
        });
    });

    $(document).on('click', '.guardar-gasto', function () {        
        $('#formRegistroGasto').validate({
            rules: {                               
                concepto: {required: true},
                valor: {required: true, digits: true},                
                descripcion: {required: true}                
            }
            
        });
        if ($('#formRegistroGasto').valid()) {
            var datos = {
                concepto: $('#concepto').val(),
                valor: $('#valor').val(),
                descripcion: $('#descripcion').val()
            };
            //console.log("paso datos");
            transaccion('ServletInsert', datos, function () {
                consulta('frmGasto.jsp', {}, function (result) {
                    $('.contenido').load('frmGasto.jsp');
                });
            });
        } else {
            return false;
        }
    });


//actualizacion Cliente(abre el modal y hace la actualizacion al mismo tiempo) y Validacion de los campos
    $(document).on('click', '.actualizacion-gasto', function () {
        var elemento = $(this);
        var datos = {
            idGasto: elemento.attr('data-idgasto')//se captura desde el boton actualizar           
        };
        //console.log(datos);
        consulta('formUpdateGasto.jsp', datos, function (result) {
            bootbox.dialog({
                title: 'Actualizacion gastos',
                message: result,
                buttons: {
                    success: {
                        label: 'Actualizar gasto',
                        ClassName: 'btn-success',
                        callback: function () {
                            $('#formUpdateGasto').validate({
                                rules: {
                                    conceptoAct: {required: true},
                                    valorAct: {required: true, digits: true},
                                    descripcionAct: {required: true}, 
                                    fecha: {required: true} 
                                }
                            });
                            if ($('#formUpdateGasto').valid()) {
                                var datos = {
                                    conceptoAct: $('#conceptoAct').val(),
                                    valorAct: $('#valorAct').val(),
                                    descripcionAct: $('#descripcionAct').val(),
                                    fecha: $('#fecha').val(),
                                    idgasto:$('#idgasto').val()
                                };
                                
                                console.log(datos);
                                transaccion('ServletUpdate', datos, function () {
                                    consulta('frmGasto.jsp', {}, function (result) {
                                        $('.contenido').load('frmGasto.jsp');
                                    });
                                });
                            } else {
                                return false;
                            }
                        }
                    }
                }
            });
        });
    });

    $(document).on('click', '.eliminacion-gasto', function () {
        var elemento = $(this);
        var datos = {
            idgasto: elemento.attr('data-idgasto')//se captura desde el boton actualizar           
        };
        bootbox.dialog({
            title: 'Eliminar gasto',
            message: "Seguro que desea eliminar el gasto?",
            buttons: {
                Confirm: {
                    label: 'Si',
                    ClassName: 'btn-success',
                    callback: function () {

                        console.log(datos);
                        transaccion('ServletDelete', datos, function () {
                            consulta('frmGasto.jsp', {}, function (result) {
                                $('.contenido').load('frmGasto.jsp');
                            });
                        });
                    }
                },
                cancel: {
                    label: 'No',
                    ClassName: 'btn-danger'
                    
                }
            }
        });

    });

  $(document).on('click', '.parametros_reporte', function () {
        //$('.registro-nuevo-usuario').click( function(){
        //console.log("ingreso");
        consulta('frmReporte.jsp', {}, function (result) {
            $('.contenido').load('frmReporte.jsp');
            console.log("ingreso");
        });
    });
    
    
//    $(document).on('click', '.generar_reporte', function () {        
//        $('#formReporte').validate({
//            rules: {                               
//                fechaIni: {required: true},
//                fechaFin: {required: true}              
//              
//            }
//            
//        });
//        if ($('#formReporte').valid()) {
//            var fi=$('#fechaIni').val()+"";
//            var ff=$('#fechaFin').val()+"";
//            var re=/-/g;
//            //fi.replace(re,"&");
//            console.log(fi.replace(re,""));
//            var datos = {
//                fechaIni: fi.replace(re,""),
//                fechaFin: ff.replace(re,"")
//                              
//            };            
//            console.log(datos);
//            transaccion('ServletReporte', datos, function () {                
//            });
//        } else {
//            return false;
//        }
//    });


});


function consulta(url, parametros, respuesta) {    
    $.ajax({
        type: 'get',
        url: url,
        data: parametros,
        success: respuesta        

    });
    
}

function transaccion(url, parametros, respuesta) {
    $.ajax({
        type: 'post',
        url: url,
        data: parametros,
        success: respuesta
    });
}
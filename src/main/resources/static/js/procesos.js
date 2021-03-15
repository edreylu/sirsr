'use strict'

function mostrarPassword() {
    var pass = document.getElementById("password");
    if (pass.type == "password") {
        pass.type = "text";
        $('.icon').removeClass('fa fa-eye-slash').addClass('fa fa-eye');
    } else {
        pass.type = "password";
        $('.icon').removeClass('fa fa-eye').addClass('fa fa-eye-slash');
    }
}

function mostrarPassword1() {
    var pass = document.getElementById("password1");
    if (pass.type == "password") {
        pass.type = "text";
        $('.icon1').removeClass('fa fa-eye-slash').addClass('fa fa-eye');
    } else {
        pass.type = "password";
        $('.icon1').removeClass('fa fa-eye').addClass('fa fa-eye-slash');
    }
}
function mostrarPassword2() {
    var pass = document.getElementById("password2");
    if (pass.type == "password") {
        pass.type = "text";
        $('.icon2').removeClass('fa fa-eye-slash').addClass('fa fa-eye');
    } else {
        pass.type = "password";
        $('.icon2').removeClass('fa fa-eye').addClass('fa fa-eye-slash');
    }
}

function nobackbutton() {
    window.location.hash = "no-back-button";
    window.location.hash = "Again-No-back-button" //chrome
    window.onhashchange = function () {
        window.location.hash = "no-back-button";
    }
}


function LoadingSpinner(form, spinnerHTML) {
    form = form || document
    var button
    var spinner = document.createElement('div')
    spinner.innerHTML = spinnerHTML
    spinner = spinner.firstChild
    form.addEventListener('click', start)
    form.addEventListener('invalid', stop, true)
    function start(event) {
        if (button)
            stop()
        button = event.target
        if (button.type === 'submit') {
            LoadingSpinner.start(button, spinner)
        }
    }

    function stop() {
        LoadingSpinner.stop(button, spinner)
    }

    function destroy() {
        stop()
        form.removeEventListener('click', start)
        form.removeEventListener('invalid', stop, true)
    }
    return {start: start, stop: stop, destroy: destroy}
}

LoadingSpinner.start = function (element, spinner) {
    element.classList.add('loading')
    return element.appendChild(spinner)
}

LoadingSpinner.stop = function (element, spinner) {
    element.classList.remove('loading')
    return spinner.remove()
}

let loginForm = document.getElementById('loginForm');
let loginLoader = new LoadingSpinner(loginForm, 'Cargando...');

// capcha
function enabledSubmit() {
    var botonSubmit = document.getElementById("submit");
    botonSubmit.disabled = false;
}


// inicializar datatable de jquery

//$(document).ready
$(() => {
    $('#tablaDatos').DataTable({
        scrollY: "230px",
        scrollCollapse: false,
        paging: true,
        searching: true,
        info: true,
        ordering: true
    });
    $('#tablaRequisiciones').DataTable({
            scrollY: "230px",
            scrollCollapse: false,
            paging: false,
            searching: false,
            info: true,
            ordering: false
        });
});

function checkPasswordMatch(fieldConfirmPassword) {
    if (fieldConfirmPassword.value != document.getElementById("password").value) {
        fieldConfirmPassword.setCustomValidity("Passwords no coinciden!");
    } else {
        fieldConfirmPassword.setCustomValidity("");
    }
}

function getXhr() {
    if (window.XMLHttpRequest) {
        return new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        return new ActiveXObject("Microsoft.XMLHTTP");
    }
}

function editarPerfil() {
    var URLdomain = "http://" + window.location.host;
    let xhr = getXhr();
    var userNamePerfil = document.getElementById("userNamePerfil").value;
    xhr.open("GET", URLdomain + "/adquisiciones/usuario/editarPerfil/" + userNamePerfil, true);
    xhr.onreadystatechange = () => {
        if (xhr.readyState == 4 && xhr.status == 200) {
            let data = xhr.responseText;
            console.log(data);
            document.getElementById("perfilModalHolder").innerHTML = data;
            $("#perfilModal").modal();
        }
    }
    xhr.send(null);
}

function showAsignarPersonal(){
    $("#asignarPersonalModal").modal();
}

function searchPersonal() {
    var noPersonal = document.getElementById("noPersonal").value;
    var noUsuario = document.getElementById("noUsuario").value;
    console.log("../../usuarios/searchPersonal/" + noPersonal + "/"+noUsuario);
    if (noPersonal != "" && noUsuario != 0) {
        var xhr = getXhr();
        xhr.open("GET", "../../usuarios/searchPersonal/" + noPersonal + "/"+noUsuario, true);
        xhr.onreadystatechange = () => {
            if (xhr.readyState === 4 && xhr.status === 200) {
                let data = xhr.responseText;
                console.log(data);
                document.getElementById("datosPersonal").innerHTML = data;
            }
        }
        xhr.send(null);
    }
}

function subirDocumento() {
    var noPersonal = document.getElementById("noPersonal").value;
    var noUsuario = document.getElementById("noUsuario").value;
    console.log("../../usuarios/searchPersonal/" + noPersonal + "/"+noUsuario);
    if (noPersonal != "" && noUsuario != 0) {
        var xhr = getXhr();
        xhr.open("GET", "../../usuarios/searchPersonal/" + noPersonal + "/"+noUsuario, true);
        xhr.onreadystatechange = () => {
            if (xhr.readyState === 4 && xhr.status === 200) {
                let data = xhr.responseText;
                console.log(data);
                document.getElementById("datosPersonal").innerHTML = data;
            }
        }
        xhr.send(null);
    }
}
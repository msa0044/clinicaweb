function mostrarMenu(a){
    let tag = document.getElementById(a);
    let submenu = tag.getElementsByClassName("submenu")
    if(submenu[0].classList.contains('open')) {
        submenu[0].classList.remove('open')
    } else {
        submenu[0].classList.add("open");
    }

}
function alterarTemaSite() {
    let tema = document.querySelector("html").getAttribute("data-bs-theme");
    if (tema === "dark") {
        document.querySelector("html").setAttribute("data-bs-theme", "light");
        document.querySelector("#alterarTemaSite").innerHTML = `<i class="bi bi-toggle-off"></i>`;

    } else {
        document.querySelector("html").setAttribute("data-bs-theme", "dark");
        document.querySelector("#alterarTemaSite").innerHTML = `<i class="bi bi-toggle-on"></i>`;

    }
}
const btn = document.getElementById("btnTop")

btn.addEventListener("click", function(){
    window.scrollTo(0,0)
})

document.addEventListener('scroll',ocultar)

function ocultar(){
    if(window.scrollY > 10){
        btn.style.display = "flex"
    } else {
        btn.style.display = "none"
    }
}

ocultar()

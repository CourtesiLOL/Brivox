// document.querySelectorAll(".menu-btn").forEach(button => {
//     button.addEventListener("click", function(event) {
//         // Previene que el clic en el botón cierre el menú
//         event.stopPropagation();
//
//         const targetId = button.getAttribute("data-target");
//         const dropdown = document.getElementById(targetId);
//
//         // Cierra otros menús abiertos
//         document.querySelectorAll('.dropdown-content').forEach(menu => {
//             if (menu !== dropdown) {
//                 menu.classList.remove("show");
//             }
//         });
//
//         // Alterna la visibilidad del menú del botón clicado
//         dropdown.classList.toggle("show");
//     });
// });
//
// // Cierra los menús si se hace clic fuera de ellos
// window.onclick = function() {
//     document.querySelectorAll('.dropdown-content').forEach(menu => {
//         menu.classList.remove('show');
//     });
// };
//


/**
 * 
 *  Estructure html for a file componenet in html
<li class="file-item">

    <div class="file-icon">
        <img src="icon-type"/>
    </div>

    <div class="file-info">
        <span class="file-name">Documento Importante</span>
        <span class="file-size">2.5 MB</span>
    </div>

    <div class="file-menu">
        <img src="/icon/"/>
    </div>

</li>
 
 **/
const IconType = {
    DOCUMENT: "/icon/file-type/document-icon.svg",
    MEDIA: "/icon/file-type/media-icon.svg",
    AUDIO: "/icon/file-type/audio-icon.svg",
    UNKNOWN: "/icon/file-type/unknown-icon.svg"
};
document.querySelectorAll(".menu-btn").forEach(button => {
    button.addEventListener("click", function(event) {
        // Previene que el clic en el botón cierre el menú
        event.stopPropagation();

        const targetId = button.getAttribute("data-target");
        const dropdown = document.getElementById(targetId);
        
        // Cierra otros menús abiertos
        document.querySelectorAll('.dropdown-content').forEach(menu => {
            if (menu !== dropdown) {
                menu.classList.remove("show");
            }
        });

        // Alterna la visibilidad del menú del botón clicado
        dropdown.classList.toggle("show");
    });
});

// Cierra los menús si se hace clic fuera de ellos
window.onclick = function() {
    document.querySelectorAll('.dropdown-content').forEach(menu => {
        menu.classList.remove('show');
    });
}

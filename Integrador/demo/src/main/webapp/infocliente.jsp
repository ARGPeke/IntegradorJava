<%@ page contentType="text/html" pageEncoding="utf-8" %>
<%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="contentType" content="text/html; charset=UTF-8">
    <title>Informacion cliente</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <header>
        
        <div class="container">	
        <a href="index.html"><img src="media/codoacodo.png" class="logo" alt="logo"></a>
        <h2 class="paneria">La Paneria</h2>			
            <nav>
                <a href="index.html#hero">Nosotros</a>
                <a href="index.html#especialidades">Especialidades</a>
                <a href="index.html#sucursales">Donde nos encontramos</a>
                <a href="index.html#contacto">Añadir Cliente</a>
                <a href="index.html#realizarpedido">Realizar pedido</a>
            </nav>
        </div>
    </header>
    <section id="hero">
    <h1 class="titulo" >Info de Cliente ID ${c.getId()} </h1>
        <p class="descripcion" > Nombre: ${c.getNombre()}</p>
        <p class="descripcion"> Apellido: ${c.getApellido()}</p>
        <p class="descripcion"> Contacto: ${c.getContacto()} </p>
    </section>
</body>
</html>
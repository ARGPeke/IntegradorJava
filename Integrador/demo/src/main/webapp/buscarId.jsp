<%@page contentType="text/html" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="contentType" content="text/html; charset=UTF-8">
    <title>Buscar</title>
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
    <h1 class="titulo">Buscar por ID</h2>
        <form action="vercliente" method="get">
            <div>
                <label> Id Cliente</label>
                <input name="id" type="text"/>
            </div>
            <input type="submit" value= "Ver"/>
        </form>
    </section>
</body>
</html>
<section id="actions" class="py-4 mb-4 bg-ligth">
    <div class="container">
        <div class="row">
            <div class = "col-md-3">
                <a href="index.jsp" class="btn btn-light btn-block">
                    <i class ="fas fa-arrow-left">
                        Regresar al inicio
                    </i>
                </a>    
            </div>
            <div class = col-md-3>
                <button type="submit" class="btn btn-success btn-block">
                    <i class ="fas fa-check"></i>
                    Guardar Cliente
                </button>
            </div>

            <div class = col-md-3>                
                <a href= "${pageContext.request.contextPath}/ServletControlador?accion=eliminar&idCliente=${cliente.idCliente}" 
                   class="btn btn-block btn-danger" 
                   <i class="fa fa-trash"> </i>  Eliminar Cliente 
                </a>

            </div>
        </div>
    </div>
</section>

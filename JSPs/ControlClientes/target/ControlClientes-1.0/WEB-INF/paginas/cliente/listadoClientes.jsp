<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setLocale value="es_MX"/>

<section>
    <div class="container">
        <div class="row">
            <!-- Inicio columnas de datos -->
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4> Listado de Cliente </h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="bg-dark text-white"> 
                            <tr>
                                <th>#</th>
                                <th>Nombre</th>
                                <th>Saldo</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="cliente" items="${clientes}" varStatus="status"> 
                                <tr>
                                    <!-- Muestra el nro de ID -->  
                                    <!-- <td> ${cliente.idCliente}</td> --> 
                                    <!-- Muestra el nro renglon -->  
                                    <td> ${status.count}</td>  
                                    <td> ${cliente.nombre} ${cliente.apellido}</td>
                                    <td> <fmt:formatNumber value="${cliente.saldo}" type="currency"/> </td>
                                    <td> 
                                        <a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&idCliente=${cliente.idCliente}"                                     
                                             class ="btn btn-secondary">
                                            <i class="fas fa-angle-double-right"></i> Editar
                                        </a>    
                                    </td>
                                </tr>                                
                            </c:forEach>
                        </tbody> 
                    </table>
                </div>  
            </div>
            <!-- Fin columnas de datos -->
            
            <!-- Inicio las tarjatas Totales -->
            <div class="col-md-3">
                <div class="card text-center bg-danger text-white mb-3">
                    <div class="card-body">
                        <h3> Saldo Total </h3>
                        <h4 class ="display-4">
                            <fmt:formatNumber value="${saldoTotal}" type="currency"/>
                        </h4>
                    </div>
                </div>
                <div class="card text-center bg-success text-white mb-3">
                    <div class="card-Body">
                        <h3> Total Cliente</h3>
                        <h4 class ="display-4">
                            <i class="fas fa-users"></i> ${totalCliente}
                                
                        </h4>
                    </div>
                            
                </div>
            </div>
            <!-- Fin las tarjatas Totales -->
        </div>
    </div>
</section>
                            
<!-- Inicio las tarjatas Totales -->
<jsp:include page="/WEB-INF/paginas/cliente/agregarCliente.jsp"/>

<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>AppPedido</title>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
  </head>
  <body>
    <div class="container mt-3">
      <h2>Classe de Domínio</h2>
      <p>Pedido</p>
      <div class="table-responsive-sm">
        <table class="table table-striped">
          <thead>
            <tr>
              <th>Campo</th>
              <th>Tipo</th>
              <th>Observação</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>Descrição</td>
              <td>String</td>
              <td>Detalhamento do Pedido</td>
            </tr>
            <tr>
              <td>Data</td>
              <td>LocalDateTime</td>
              <td>Data de Realização do Pedido</td>
            </tr>
            <tr>
              <td>Web</td>
              <td>boolean</td>
              <td>
                Indicativo se o pedido foi realizado presencialmente ou pela web
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </body>
</html>

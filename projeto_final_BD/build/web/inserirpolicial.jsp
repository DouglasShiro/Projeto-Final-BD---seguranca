<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inserção de dados dos policiais</title>
    </head>
    <body>
        <form action="segurancamvc" method="post">
            <table>
                <tr>
                    <td>Id_policial</td><td><input type="text" maxlength="10" name="id_policial"></input></td>
                </tr>
                <tr>
                    <td>Nome</td><td><input type="text" maxlength="50" name="nome"></input></td>
                </tr>
                <tr>
                    <td>Titulo</td><td><input type="text" maxlength="30" name="titulo"></input></td>
                </tr>
                <tr>
                    <td>CEP</td><td><input type="text" maxlength="2" name="cep"></input></td>
                </tr>
                <tr>
                    <td>Cidade</td><td><input type="text" maxlength="30" name="cidade"></input></td>
                </tr>
                <tr>
                    <td>Bairro</td><td><input type="text" maxlength="30" name="bairro"></input></td>
                </tr>
                <tr>
                    <td>Estado</td><td><input type="text" maxlength="30" name="estado"></input></td>
                </tr>
                <tr><td align="center" colspan="2"><input type="submit" value="Inserir"></input></td></tr>
                <tr><td><input type="hidden" name="execucao" value="ServletInserirPolicial"></input></td></tr>
            </table>
        </form>
    </body>
</html>
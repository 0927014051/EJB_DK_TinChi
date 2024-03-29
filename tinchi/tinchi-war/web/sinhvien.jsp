    
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="modal.SinhVien"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="Session.SinhVienRemote"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
    private SinhVienRemote sinhVien;

    public void jspInit() {
        try {
            InitialContext ic = new InitialContext();
            sinhVien = (SinhVienRemote) ic.lookup(SinhVienRemote.class.getName());
        } catch (Exception e) {
            System.out.println("Couldn't create sinhvien bean. " + e.getMessage());
        }
    }

    public void jspDestroy() {
        sinhVien = null;
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADD SINHVIEN</title>
    </head>
    <body>
        <form method ="POST">

            <p> Id sinh vien:  <input type ="text" name ="id_sinhvien" size ="25">
                <br>
                <br>
            <p> Ho:  <input type =" text" name ="ho" size ="25">
                <br>
                <br>
            <p> Ten: <input type =" text" name ="ten" size ="25">
                <br>
                <br>
            <p> Ngay Sinh: <input type ="Date" name ="ngaysinh" size ="25">
                <br>
                <br>
            <p> Gioi tinh: <input type =" text" name ="gioitinh" size ="25">
                <br>
                <br>
            <p> Dia chi: <input type =" text" name ="diachi" size ="25">
                <br>
                <br>
            <p> So dien thoai: <input type =" text" name ="sdt" size ="25">
                <br>
                <br>
            <p> Lop:  <input type =" text" name ="id_lop" size ="25"> 
            <p><input type="submit" value="Thêm Sinh Viên"></p>

        </form>
        <%
            if ("POST".equalsIgnoreCase(request.getMethod())) {
                String idSV = request.getParameter("id_sinhvien");
                String ho = request.getParameter("ho");

                String ten = request.getParameter("ten");

                String ngaysinh = request.getParameter("ngaysinh");
             
                String gioitinh = request.getParameter("gioitinh");

                String diachi = request.getParameter("diachi");

                String sdt = request.getParameter("sdt");
                String id_lop = request.getParameter("id_lop");
                SinhVien sv = new SinhVien(idSV, ho, ten, gioitinh, ngaysinh, diachi, sdt, id_lop);

                if (idSV != null && ho != null && ten != null && ngaysinh != null && gioitinh != null && diachi != null && sdt != null && id_lop != null) {
                    sinhVien.insertSinhVien(sv);
                            out.println("<p style='color: red;'>Them Thanh cong!</p>");

                }
            }
        %>  
        <h2>DANH SACH SINH VIEN</h2>
        <% if (sinhVien.getAllSinhVien() != null) {%> ` 
        <table>
            <tr style = "width: 100px">
                <th>ID</th>
                <th>Ho</th>
                <th>Ten</th>
                <th>Ngay Sinh</th>
                <th>Gioi Tinh</th>
                <th>Dia Chi</th>
                <th>So Dien Thoai</th>
                <th>Lop</th>
            </tr>
            <% List<SinhVien> list = sinhVien.getAllSinhVien();%>
            <% for (SinhVien item : list) {%>
            <tr style = "width: 100px">
                <td><%= item.getId_SV()%></td>
                <td><%= item.getHo()%></td>
                <td><%= item.getTen()%></td>
                <td><%= item.getNgay_Sinh()%></td>
                <td><%= item.getGioiTinh()%></td>
                <td><%= item.getDia_chi()%></td>
                <td><%= item.getSDT()%></td>
                <td><%= item.getId_lop()%></td>
            </tr>
            <% } %>

        </table>
            
        <% }%>
    </body>
</html>

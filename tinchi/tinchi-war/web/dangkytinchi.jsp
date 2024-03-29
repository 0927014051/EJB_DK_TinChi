<%-- 
        Document   : dangkytinchi
    Created on : Mar 28, 2024, 9:54:40 PM
    Author     : thanh
--%>
<%@page import="modal.DangKyTinChi"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Session.LopTinChiRemote"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="Session.DangKyTinChiRemote"%>
<%@page import="modal.LopTinChi"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    private LopTinChiRemote dangKyTinChiRemote;
    private DangKyTinChiRemote dk;

    public void jspInit() {
        try {
            InitialContext ic = new InitialContext();
            dangKyTinChiRemote = (LopTinChiRemote) ic.lookup(LopTinChiRemote.class.getName());
            dk = (DangKyTinChiRemote) ic.lookup(DangKyTinChiRemote.class.getName());

        } catch (Exception e) {
            System.out.println("Couldn't create dangkytinchi bean. " + e.getMessage());
        }
    }

    public void jspDestroy() {
        dangKyTinChiRemote = null;
        dk = null;
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <h2>Danh sách Lớp Tin Chỉ</h2>
    <form method ="POST">
        <table border="1">
            <tr>
                <th>ID</th>               
                <th>Tên môn học</th>
                <th>Niên khóa</th>
                <th>Nhóm</th>
                <th>Học kỳ</th>
                <th>Số lượng SV</th>
                <th>Thời gian bắt đầu</th>
                <th>Thời gian kết thúc</th>
                <th>Chọn</th> <!-- Cột chứa checkbox -->
            </tr>

            <% for (LopTinChi lop : dangKyTinChiRemote.danhSachTinChi()) {%>
            <tr>
                <td><%= lop.getId_lopTinChi()%></td>
                <td><%= lop.getTenLopTinChi()%> </td>
                <td><%= lop.getNienKhoa()%></td>
                <td><%= lop.getNhom()%></td>
                <td><%= lop.getHocKy()%></td>
                <td><%= lop.getSoLuongSV()%></td>
                <td><%= formatDate(lop.getThoiGianBatDau())%></td>
                <td><%= formatDate(lop.getThoiGianKetThuc())%></td>
                <td>
                    <input type="checkbox" name="idLopTinChi" value="<%= lop.getId_lopTinChi()%>">
                </td>
            </tr>
            <% } %>
        </table>
        <input type="submit" value="Đăng ký">

    </form>
    <%
        if ("POST".equalsIgnoreCase(request.getMethod())) {
            // Lấy giá trị của checkbox từ request

            String[] idLopTinChiArr = request.getParameterValues("idLopTinChi");

            // Danh sách lớp tin chỉ đã chọn
            List<String> danhSachDaChon = new ArrayList();

            if (idLopTinChiArr != null) {
                for (String id : idLopTinChiArr) {
                    danhSachDaChon.add(id);
                }
            }

            // Gọi hàm dangKyTinChi(idLopTinChi) với danh sách đã chọn
            for (String id : danhSachDaChon) {
                dk.dangKyTinChi(id);
            }
        }
        List<LopTinChi> allTinChiDangKy = new ArrayList();
        for (LopTinChi l : dangKyTinChiRemote.danhSachTinChi()) {
            for (DangKyTinChi d : dk.danhSachDangKyTinChi()) {
                if (l.getId_lopTinChi().equals(d.getId_lopTinChi())) {
                    allTinChiDangKy.add(l);
                }
            }
        }
    %>
    <h2>DANH SACH TIN CHI DA DANG KY</h2>
    <% if (dk.danhSachDangKyTinChi() != null) {%> ` 
    <table>
        <tr style = "width: 100px">
            <th>ID</th>
            <th>Tên môn học</th>
            <th>Niên khóa</th>
            <th>Nhóm</th>
            <th>Học kỳ</th>
            <th>Số lượng SV</th>
            <th>Thời gian bắt đầu</th>
            <th>Thời gian kết thúc</th>    

        </tr>
        <% List<DangKyTinChi> list = dk.danhSachDangKyTinChi();%>
        <% for (LopTinChi item : allTinChiDangKy) {%>
        <tr style = "width: 100px">
            <td><%= item.getId_lopTinChi()%></td> 
            <td><%= item.getTenLopTinChi()%></td> 
            <td><%= item.getNienKhoa()%></td> 
            <td><%= item.getNhom()%></td> 
            <td><%= item.getHocKy()%></td> 
            <td><%= item.getSoLuongSV()%></td> 
            <td><%= item.getThoiGianBatDau()%></td> 
            <td><%= item.getThoiGianKetThuc()%></td> 
        </tr>
        <% } %>

    </table>

    <% }%>
    <%!
        // Phương thức để định dạng ngày
        public String formatDate(Date date) {
            if (date == null) {
                return "";
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.format(date);
        }
    %>

</html>

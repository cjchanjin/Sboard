<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<%@include file="../side.jsp" %>
<%@include file="../top.jsp" %>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function trSelect(key) {
		document.frm.bId.value=key;
		document.frm.submit();
	}
</script>
</head>
<body>

<!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->
          <h1 class="h3 mb-2 text-gray-800">Tables</h1>
          <p class="mb-4">DataTables is a third party plugin that is used to generate the demo table below. For more information about DataTables, please visit the <a target="_blank" href="https://datatables.net">official DataTables documentation</a>.</p>

          <!-- DataTales Example -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
            </div>
            <div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>글번호</th>
                      <th>작성자</th>
                      <th>제목</th>
                      <th>작성일자</th>
                      <th>조회수</th>
                      <th>첨부파일</th>
                    </tr>
                  </thead>
                  <tfoot>
                    <tr>
                      <th>글번호</th>
                      <th>작성자</th>
                      <th>제목</th>
                      <th>작성일자</th>
                      <th>조회수</th>
                      <th>첨부파일</th>
                    </tr>
                  </tfoot>
                  <c:forEach var="vo" items="${list }">
                  <tbody>
                    <tr onclick="trSelect(${vo.boardId})" 
                    onMouseOver="this.style.backgroundColor='silver';" onMouseOut="this.style.backgroundColor='';">
                      <td>${vo.boardId }</td>
                      <td>${vo.writer }</td>
                      <td>${vo.title }</td>
                      <td>${vo.wDate }</td>
                      <td>${vo.hit }</td>
                      <td>${vo.fileName }</td>
                    </tr>
                  </tbody>
                  </c:forEach>
                </table>
              	<div align="right">
					<a href="#" class="btn btn-danger btn-icon-split">
                    	<span class="icon text-white-50">
                    	  <i class="fas fa-check"></i>
                  	  	</span>
                    	<span class="text">글쓰기</span>
                  </a>&nbsp;&nbsp;&nbsp;
					<a href="/Sboard" class="btn btn-success btn-icon-split">
                    	<span class="icon text-white-50">
                    	  <i class="fas fa-info-circle"></i>
                  	  	</span>
                    	<span class="text">홈</span>
                  </a>
				</div>
              </div>
            </div>
          </div>

        </div>
        <!-- /.container-fluid -->
		<form id="frm" name="frm" action="boardGetList.do" method="post">
			<input type="hidden" id="bId" name="bId">
		</form>

</body>
</html>
<%@include file="../footer.jsp" %>
    <!-- Page level plugins -->
  <script src="resources/startbootstrap/vendor/datatables/jquery.dataTables.min.js"></script>
  <script src="resources/startbootstrap/vendor/datatables/dataTables.bootstrap4.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="resources/startbootstrap/js/demo/datatables-demo.js"></script>
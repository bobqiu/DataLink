<%@ page language="java" pageEncoding="utf-8" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="basePath" value="${pageContext.servletContext.contextPath }"/>

<div class="main-content-inner">
    <div class="page-content">
        <div class="row">

            <form id="add_form" class="form-horizontal" role="form">


                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="form-add-es_reader_indextype">index.type</label>
                    <div class="col-sm-9">
                        <input type="text" id="form-add-es_reader_indextype" name="form-add-es_reader_indextype" value="" onblur="reloadJson()"
                               class="col-xs-10 col-sm-5" style="width:350px;height:35px" maxlength="50" />
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right" for="form-add-es_reader_query">query</label>
                    <div class="col-sm-9">
                        <textarea id="form-add-es_reader_query" name="form-add-es_reader_query" onblur="reloadJson()" class="col-xs-10 col-sm-5" rows="10" cols="150" >
                        </textarea>
                    </div>
                </div>

            </form>
        </div>

    </div>
    <!-- /.page-content -->
</div>
<script type="text/javascript">

</script>

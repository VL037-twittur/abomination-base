package vincentlow.twittur.base.web.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import vincentlow.twittur.base.web.model.response.PageMetaData;
import vincentlow.twittur.base.web.model.response.api.ApiListResponse;
import vincentlow.twittur.base.web.model.response.api.ApiResponse;
import vincentlow.twittur.base.web.model.response.api.ApiSingleResponse;

public class BaseController {

  protected ApiResponse successResponse = new ApiResponse(HttpStatus.OK, null);

  protected <T> ApiSingleResponse toApiSingleResponse(T data) {

    return new ApiSingleResponse(HttpStatus.OK, null, data);
  }

  protected <T> ApiListResponse toApiListResponse(List<T> content, PageMetaData pageMetaData) {

    return new ApiListResponse(HttpStatus.OK, null, content, pageMetaData);
  }

  protected ApiResponse toErrorApiResponse(HttpStatus httpStatus, String error) {

    return new ApiResponse(httpStatus, error);
  }

  protected <T> ResponseEntity toSuccessResponseEntity(ApiResponse apiResponse) {

    return new ResponseEntity(apiResponse, HttpStatus.OK);
  }

  protected <T> ResponseEntity toSuccessResponseEntity(ApiSingleResponse singleResponse) {

    return new ResponseEntity(singleResponse, HttpStatus.OK);
  }

  protected <T> ResponseEntity toSuccessResponseEntity(ApiListResponse listResponse) {

    return new ResponseEntity(listResponse, HttpStatus.OK);
  }

  protected <T> ResponseEntity toErrorResponseEntity(ApiResponse apiResponse, HttpStatus httpStatus) {

    return new ResponseEntity(apiResponse, httpStatus);
  }

  protected PageMetaData getPageMetaData(Page page, int pageNumber, int pageSize) {

    return PageMetaData.builder()
        .pageNumber(pageNumber)
        .pageSize(pageSize)
        .totalRecords(page.getTotalElements())
        .build();
  }

}

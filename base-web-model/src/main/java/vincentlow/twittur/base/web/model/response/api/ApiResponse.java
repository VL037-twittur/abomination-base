package vincentlow.twittur.base.web.model.response.api;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse implements Serializable {

  private static final long serialVersionUID = -8810877986413094433L;

  private int code;

  private String status;

  private String error;

  public ApiResponse(HttpStatus httpStatus, String error) {

    this.code = httpStatus.value();
    this.status = httpStatus.name();
    this.error = error;
  }
}

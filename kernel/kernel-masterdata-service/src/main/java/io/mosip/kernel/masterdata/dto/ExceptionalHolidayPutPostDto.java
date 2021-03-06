
package io.mosip.kernel.masterdata.dto;

import io.mosip.kernel.masterdata.validator.ValidDateFormat;
import lombok.Data;

@Data
public class ExceptionalHolidayPutPostDto {

	@ValidDateFormat
	private String exceptionHolidayDate;

	private String exceptionHolidayName;

	private String exceptionHolidayReson;

}

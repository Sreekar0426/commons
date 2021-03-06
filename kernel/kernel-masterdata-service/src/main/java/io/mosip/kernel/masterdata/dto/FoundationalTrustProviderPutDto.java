/**
 * 
 */
package io.mosip.kernel.masterdata.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ramadurai Pandian
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoundationalTrustProviderPutDto {

	@NotBlank
	@Size(min = 0, max = 36)
	private String id;

	@NotBlank
	@Size(min = 0, max = 128)
	private String name;

	@NotBlank
	@Size(min = 0, max = 512)
	private String address;

	@NotBlank
	@Size(min = 0, max = 256)
	private String email;

	@NotBlank
	@Size(min = 0, max = 16)
	private String contactNo;

	@NotBlank
	@Size(min = 0, max = 36)
	private String certAlias;

	@NotNull
	private boolean isActive;

}

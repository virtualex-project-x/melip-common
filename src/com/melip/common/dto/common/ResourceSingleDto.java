package com.melip.common.dto.common;

/**
 * 単体用のリソースDTOです。
 * 
 * @param <T>
 */
public class ResourceSingleDto<T extends IDto> extends AbstractResourceDto {

  /** DTOのフィールド名 */
  public static final String FIELD_DTO = "dto";

  /** DTO */
  private T dto;

  /**
   * コンストラクタ
   */
  public ResourceSingleDto() {}

  /**
   * コンストラクタ
   * 
   * @param dto DTO
   */
  public ResourceSingleDto(T dto) {
    this(null, dto);
  }

  /**
   * コンストラクタ
   * 
   * @param entity エンティティ
   * @param dto DTO
   */
  public ResourceSingleDto(String entity, T dto) {

    super(entity);
    this.dto = dto;
  }

  /**
   * DTOを取得します。
   * 
   * @return T extends IDto
   */
  public T getDto() {
    return dto;
  }

  /**
   * DTOを設定します。
   * 
   * @param dto DTO
   */
  public void setDto(T dto) {
    this.dto = dto;
  }

}

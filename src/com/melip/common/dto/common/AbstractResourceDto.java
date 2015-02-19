package com.melip.common.dto.common;

/**
 * リソースDTOの基底クラスです。
 */
public abstract class AbstractResourceDto extends AbstractDto {

  /** エンティティのフィールド名 */
  public static final String FIELD_ENTITY = "entity";

  /** エンティティ */
  private String entity;

  /**
   * コンストラクタ
   */
  public AbstractResourceDto() {}

  /**
   * コンストラクタ
   * 
   * @param entity エンティティ
   */
  public AbstractResourceDto(String entity) {
    this.entity = entity;
  }

  /**
   * エンティティを取得します。
   * 
   * @return エンティティ
   */
  public String getEntity() {
    return entity;
  }

  /**
   * エンティティを設定します。
   * 
   * @param entity エンティティ
   */
  public void setEntity(String entity) {
    this.entity = entity;
  }

}

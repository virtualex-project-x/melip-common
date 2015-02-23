package com.melip.common.dto.common;

import java.util.List;

/**
 * 複数用のリソースDTOです。
 */
public class ResourceMultiDto extends AbstractResourceDto {

  private static final long serialVersionUID = 1L;

  /** 全件数のフィールド名 */
  public static final String FIELD_ALL_COUNT = "allCount";
  /** 開始位置のフィールド名 */
  public static final String FIELD_INDEX = "index";
  /** 取得件数のフィールド名 */
  public static final String FIELD_COUNT = "count";
  /** DTOリストのフィールド名 */
  public static final String FIELD_DTO_LIST = "dtoList";

  /** 全件数 */
  private Integer allCount;
  /** 開始位置 */
  private Integer index;
  /** 取得件数 */
  private Integer count;
  /** DTOリスト */
  private List<? extends IDto> dtoList;

  /**
   * コンストラクタ
   */
  public ResourceMultiDto() {}

  /**
   * コンストラクタ
   * 
   * @param entity エンティティ
   */
  public ResourceMultiDto(String entity) {
    super(entity);
  }

  /**
   * 全件数を取得します。
   * 
   * @return 全件数
   */
  public Integer getAllCount() {
    return allCount;
  }

  /**
   * 全件数を設定します。
   * 
   * @param allCount 全件数
   */
  public void setAllCount(Integer allCount) {
    this.allCount = allCount;
  }

  /**
   * 開始位置を取得します。
   * 
   * @return 開始位置
   */
  public Integer getIndex() {
    return index;
  }

  /**
   * 開始位置を設定します。
   * 
   * @param index 開始位置
   */
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * 取得件数を取得します。
   * 
   * @return 取得件数
   */
  public Integer getCount() {
    return count;
  }

  /**
   * 取得件数を設定します。
   * 
   * @param count 取得件数
   */
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   * DTOリストを取得します。
   * 
   * @return DTOリスト
   */
  public List<? extends IDto> getDtoList() {
    return dtoList;
  }

  /**
   * DTOリストを設定します。
   * 
   * @param dtoList DTOリスト
   */
  public void setDtoList(List<? extends IDto> dtoList) {
    this.dtoList = dtoList;
  }

}

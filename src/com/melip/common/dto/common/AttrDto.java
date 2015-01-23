package com.melip.common.dto.common;

/**
 * 属性DTO
 */
public class AttrDto extends AbstractDto {

  /** 属性グループIDのフィールド名 */
  public static final String FIELD_ATTR_GRP_ID = "attrGrpId";
  /** 属性グループ種別のフィールド名 */
  public static final String FIELD_ATTR_GRP_TYPE = "attrGrpType";
  /** 属性グループ名称のフィールド名 */
  public static final String FIELD_ATTR_GRP_NM = "attrGrpNm";
  /** 属性値のフィールド名 */
  public static final String FIELD_ATTR_VAL = "attrVal";
  /** 属性コード値のフィールド名 */
  public static final String FIELD_ATTR_CD_VAL = "attrCdVal";

  /** 属性グループID */
  private Integer attrGrpId;
  /** 属性グループ種別 */
  private String attrGrpType;
  /** 属性グループ名称 */
  private String attrGrpNm;
  /** 属性値 */
  private String attrVal;
  /** 属性コード値 */
  private String attrCdVal;

  // シリアルバージョンUID
  private static final long serialVersionUID = 1L;

  /**
   * 属性グループIDを取得します。
   * 
   * @return 属性グループID
   */
  public Integer getAttrGrpId() {
    return attrGrpId;
  }

  /**
   * 属性グループIDを設定します。
   * 
   * @param attrGrpId 属性グループID
   */
  public void setAttrGrpId(Integer attrGrpId) {
    this.attrGrpId = attrGrpId;
  }

  /**
   * 属性グループ種別を取得します。
   * 
   * @return 属性グループ種別
   */
  public String getAttrGrpType() {
    return attrGrpType;
  }

  /**
   * 属性グループ種別を設定します。
   * 
   * @param attrGrpType 属性グループ種別
   */
  public void setAttrGrpType(String attrGrpType) {
    this.attrGrpType = attrGrpType;
  }

  /**
   * 属性グループ名称を取得します。
   * 
   * @return 属性グループ名称
   */
  public String getAttrGrpNm() {
    return attrGrpNm;
  }

  /**
   * 属性グループ名称を設定します。
   * 
   * @param attrGrpNm 属性グループ名称
   */
  public void setAttrGrpNm(String attrGrpNm) {
    this.attrGrpNm = attrGrpNm;
  }

  /**
   * 属性値を取得します。
   * 
   * @return 属性値
   */
  public String getAttrVal() {
    return attrVal;
  }

  /**
   * 属性値を設定します。
   * 
   * @param attrVal 属性値
   */
  public void setAttrVal(String attrVal) {
    this.attrVal = attrVal;
  }

  /**
   * 属性コード値を取得します。
   * 
   * @return 属性コード値
   */
  public String getAttrCdVal() {
    return attrCdVal;
  }

  /**
   * 属性コード値を設定します。
   * 
   * @param attrCdVal 属性コード値
   */
  public void setAttrCdVal(String attrCdVal) {
    this.attrCdVal = attrCdVal;
  }

}

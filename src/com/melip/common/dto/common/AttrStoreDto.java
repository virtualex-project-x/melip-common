package com.melip.common.dto.common;

/**
 * 属性登録更新DTO
 */
public class AttrStoreDto extends AbstractDto {

  private static final long serialVersionUID = 1L;

  /** 属性グループIDのフィールド名 */
  public static final String FIELD_ATTR_GRP_ID = "attrGrpId";
  /** 属性グループエイリアスのフィールド名 */
  public static final String FIELD_ATTR_GRP_ALIAS = "attrGrpAlias";
  /** 属性言語区分のフィールド名 */
  public static final String FIELD_ATTR_LANG_DIV = "attrLangDiv";
  /** 属性値のフィールド名 */
  public static final String FIELD_ATTR_VAL = "attrVal";

  /** 属性グループID */
  private Integer attrGrpId;
  /** 属性グループエイリアス */
  private String attrGrpAlias;
  /** 属性言語区分 */
  private String attrLangDiv;
  /** 属性値 */
  private String attrVal;

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
   * 属性グループエイリアスを取得します。
   * 
   * @return 属性グループエイリアス
   */
  public String getAttrGrpAlias() {
    return attrGrpAlias;
  }

  /**
   * 属性グループエイリアスを設定します。
   * 
   * @param attrGrpAlias 属性グループエイリアス
   */
  public void setAttrGrpAlias(String attrGrpAlias) {
    this.attrGrpAlias = attrGrpAlias;
  }

  /**
   * 属性言語区分を取得します。
   * 
   * @return 属性言語区分
   */
  public String getAttrLangDiv() {
    return attrLangDiv;
  }

  /**
   * 属性言語区分を設定します。
   * 
   * @param attrLangDiv 属性言語区分
   */
  public void setAttrLangDiv(String attrLangDiv) {
    this.attrLangDiv = attrLangDiv;
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

}

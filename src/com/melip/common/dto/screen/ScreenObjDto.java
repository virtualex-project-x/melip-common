package com.melip.common.dto.screen;

import com.melip.common.dto.common.AbstractDto;

/**
 * スクリーンオブジェクトDTO
 */
public class ScreenObjDto extends AbstractDto {

  /** レイアウトオブジェクトIDのフィールド名 */
  public static final String FIELD_LAYOUT_OBJ_ID = "layoutObjId";
  /** スクリーンオブジェクトIDのフィールド名 */
  public static final String FIELD_SCREEN_OBJ_ID = "screenObjId";
  /** 属性グループIDのフィールド名 */
  public static final String FIELD_ATT_GRP_ID = "attGrpId";
  /** 属性グループ種別のフィールド名 */
  public static final String FIELD_ATT_GRP_TYPE = "attGrpType";
  /** 属性グループ名称のフィールド名 */
  public static final String FIELD_ATT_GRP_NM = "attGrpNm";
  /** 属性値のフィールド名 */
  public static final String FIELD_ATT_VAL = "attVal";
  /** 属性コード値のフィールド名 */
  public static final String FIELD_ATT_CD_VAL = "attCdVal";

  /** レイアウトオブジェクトID */
  private Integer layoutObjId;
  /** スクリーンオブジェクトID */
  private Integer screenObjId;
  /** 属性グループID */
  private Integer attGrpId;
  /** 属性グループ種別 */
  private String attGrpType;
  /** 属性グループ名称 */
  private String attGrpNm;
  /** 属性値 */
  private String attVal;
  /** 属性コード値 */
  private String attCdVal;

  // シリアルバージョンUID
  private static final long serialVersionUID = 1L;

  /**
   * レイアウトオブジェクトIDを取得します。
   *
   * @return レイアウトオブジェクトID
   */
  public Integer getLayoutObjId() {
    return layoutObjId;
  }

  /**
   * レイアウトオブジェクトIDを設定します。
   *
   * @param layoutObjId レイアウトオブジェクトID
   */
  public void setLayoutObjId(Integer layoutObjId) {
    this.layoutObjId = layoutObjId;
  }

  /**
   * スクリーンオブジェクトIDを取得します。
   *
   * @return スクリーンオブジェクトID
   */
  public Integer getScreenObjId() {
    return screenObjId;
  }

  /**
   * スクリーンオブジェクトIDを設定します。
   *
   * @param screenObjId スクリーンオブジェクトID
   */
  public void setScreenObjId(Integer screenObjId) {
    this.screenObjId = screenObjId;
  }

  /**
   * 属性グループIDを取得します。
   *
   * @return 属性グループID
   */
  public Integer getAttGrpId() {
    return attGrpId;
  }

  /**
   * 属性グループIDを設定します。
   *
   * @param attGrpId 属性グループID
   */
  public void setAttGrpId(Integer attGrpId) {
    this.attGrpId = attGrpId;
  }

  /**
   * 属性グループ種別を取得します。
   *
   * @return 属性グループ種別
   */
  public String getAttGrpType() {
    return attGrpType;
  }

  /**
   * 属性グループ種別を設定します。
   *
   * @param attGrpType 属性グループ種別
   */
  public void setAttGrpType(String attGrpType) {
    this.attGrpType = attGrpType;
  }

  /**
   * 属性グループ名称を取得します。
   *
   * @return 属性グループ名称
   */
  public String getAttGrpNm() {
    return attGrpNm;
  }

  /**
   * 属性グループ名称を設定します。
   *
   * @param attGrpNm 属性グループ名称
   */
  public void setAttGrpNm(String attGrpNm) {
    this.attGrpNm = attGrpNm;
  }

  /**
   * 属性値を取得します。
   *
   * @return 属性値
   */
  public String getAttVal() {
    return attVal;
  }

  /**
   * 属性値を設定します。
   *
   * @param attVal 属性値
   */
  public void setAttVal(String attVal) {
    this.attVal = attVal;
  }

  /**
   * 属性コード値を取得します。
   *
   * @return 属性コード値
   */
  public String getAttCdVal() {
    return attCdVal;
  }

  /**
   * 属性コード値を設定します。
   *
   * @param attCdVal 属性コード値
   */
  public void setAttCdVal(String attCdVal) {
    this.attCdVal = attCdVal;
  }

}

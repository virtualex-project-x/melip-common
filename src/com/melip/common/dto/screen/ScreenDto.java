package com.melip.common.dto.screen;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.melip.common.dto.common.AbstractDto;

/**
 * スクリーンDTO
 */
@XmlRootElement
public class ScreenDto extends AbstractDto {

  /** レイアウトIDのフィールド名 */
  public static final String FIELD_LAYOUT_ID = "layoutId";
  /** レイアウトエイリアスのフィールド名 */
  public static final String FIELD_LAYOUT_ALIAS = "layoutAlias";
  /** レイアウト種別コードエイリアスのフィールド名 */
  public static final String FIELD_LAYOUT_TYPE_CD_ALIAS = "layoutTypeCdAlias";
  /** スクリーンIDのフィールド名 */
  public static final String FIELD_SCREEN_ID = "screenId";
  /** スクリーンオブジェクトグループリストのフィールド名 */
  public static final String FIELD_SCREEN_OBJ_GRP_DTO_LIST = "screenObjGrpDtoList";

  /** レイアウトID */
  private Integer layoutId;
  /** レイアウトエイリアス */
  private String layoutAlias;
  /** レイアウト種別コードエイリアス */
  private String layoutTypeCdAlias;
  /** スクリーンID */
  private Integer screenId;
  /** スクリーンオブジェクトグループリスト */
  private List<ScreenObjGrpDto> screenObjGrpDtoList;

  // シリアルバージョンUID
  private static final long serialVersionUID = 1L;

  /**
   * レイアウトIDを取得します。
   * 
   * @return レイアウトID
   */
  public Integer getLayoutId() {
    return layoutId;
  }

  /**
   * レイアウトIDを設定します。
   * 
   * @param layoutId レイアウトID
   */
  public void setLayoutId(Integer layoutId) {
    this.layoutId = layoutId;
  }

  /**
   * レイアウトエイリアスを取得します。
   * 
   * @return レイアウトエイリアス
   */
  public String getLayoutAlias() {
    return layoutAlias;
  }

  /**
   * レイアウトエイリアスを設定します。
   * 
   * @param layoutAlias レイアウトエイリアス
   */
  public void setLayoutAlias(String layoutAlias) {
    this.layoutAlias = layoutAlias;
  }

  /**
   * レイアウト種別コードエイリアスを取得します。
   * 
   * @return レイアウト種別コードエイリアス
   */
  public String getLayoutTypeCdAlias() {
    return layoutTypeCdAlias;
  }

  /**
   * レイアウト種別コードエイリアスを設定します。
   * 
   * @param layoutTypeCdAlias レイアウト種別コードエイリアス
   */
  public void setLayoutTypeCdAlias(String layoutTypeCdAlias) {
    this.layoutTypeCdAlias = layoutTypeCdAlias;
  }

  /**
   * スクリーンIDを取得します。
   * 
   * @return スクリーンID
   */
  public Integer getScreenId() {
    return screenId;
  }

  /**
   * スクリーンIDを設定します。
   * 
   * @param screenId スクリーンID
   */
  public void setScreenId(Integer screenId) {
    this.screenId = screenId;
  }

  /**
   * スクリーンオブジェクトグループリストを取得します。
   * 
   * @return スクリーンオブジェクトグループリスト
   */
  public List<ScreenObjGrpDto> getScreenObjGrpDtoList() {
    return screenObjGrpDtoList;
  }

  /**
   * スクリーンオブジェクトグループリストを設定します。
   * 
   * @param screenObjGrpDtoList スクリーンオブジェクトグループリスト
   */
  public void setScreenObjGrpDtoList(List<ScreenObjGrpDto> screenObjGrpDtoList) {
    this.screenObjGrpDtoList = screenObjGrpDtoList;
  }

}

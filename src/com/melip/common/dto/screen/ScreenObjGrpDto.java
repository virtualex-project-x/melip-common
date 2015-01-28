package com.melip.common.dto.screen;

import java.util.List;

import com.melip.common.dto.common.AbstractDto;

/**
 * スクリーンオブジェクトグループDTO.
 */
public class ScreenObjGrpDto extends AbstractDto {

  /** レイアウトオブジェクトグループIDのフィールド名 */
  public static final String FIELD_LAYOUT_OBJ_GRP_ID = "layoutObjGrpId";
  /** レイアウトオブジェクトグループエイリアスのフィールド名 */
  public static final String FIELD_LAYOUT_OBJ_GRP_ALIAS = "layoutObjGrpAlias";
  /** 多重度のフィールド名 */
  public static final String FIELD_MULTIPLICITY = "multiplicity";
  /** スクリーンオブジェクトグループIDのフィールド名 */
  public static final String FIELD_SCREEN_OBJ_GRP_ID = "screenObjGrpId";
  /** スクリーンオブジェクトバンチDTOリストのフィールド名 */
  public static final String FIELD_SCREEN_OBJ_BUNCH_DTO_LIST = "screenObjBunchDtoList";

  /** レイアウトオブジェクトグループID */
  private Integer layoutObjGrpId;
  /** レイアウトオブジェクトグループエイリアス */
  private String layoutObjGrpAlias;
  /** 多重度 */
  private String multiplicity;
  /** スクリーンオブジェクトグループID */
  private Integer screenObjGrpId;
  /** スクリーンオブジェクトバンチDTOリスト */
  private List<ScreenObjBunchDto> screenObjBunchDtoList;

  // シリアルバージョンUID
  private static final long serialVersionUID = 1L;

  /**
   * レイアウトオブジェクトグループIDを取得します。
   * 
   * @return レイアウトオブジェクトグループID
   */
  public Integer getLayoutObjGrpId() {
    return layoutObjGrpId;
  }

  /**
   * レイアウトオブジェクトグループIDを設定します。
   * 
   * @param layoutObjGrpId レイアウトオブジェクトグループID
   */
  public void setLayoutObjGrpId(Integer layoutObjGrpId) {
    this.layoutObjGrpId = layoutObjGrpId;
  }

  /**
   * レイアウトオブジェクトグループエイリアスを取得します。
   * 
   * @return レイアウトオブジェクトグループエイリアス
   */
  public String getLayoutObjGrpAlias() {
    return layoutObjGrpAlias;
  }

  /**
   * レイアウトオブジェクトグループエイリアスを設定します。
   * 
   * @param layoutObjGrpAlias レイアウトオブジェクトグループエイリアス
   */
  public void setLayoutObjGrpAlias(String layoutObjGrpAlias) {
    this.layoutObjGrpAlias = layoutObjGrpAlias;
  }

  /**
   * 多重度を取得します。
   * 
   * @return 多重度
   */
  public String getMultiplicity() {
    return multiplicity;
  }

  /**
   * 多重度を設定します。
   * 
   * @param multiplicity 多重度
   */
  public void setMultiplicity(String multiplicity) {
    this.multiplicity = multiplicity;
  }

  /**
   * スクリーンオブジェクトグループIDを取得します。
   * 
   * @return スクリーンオブジェクトグループID
   */
  public Integer getScreenObjGrpId() {
    return screenObjGrpId;
  }

  /**
   * スクリーンオブジェクトグループIDを設定します。
   * 
   * @param screenObjGrpId スクリーンオブジェクトグループID
   */
  public void setScreenObjGrpId(Integer screenObjGrpId) {
    this.screenObjGrpId = screenObjGrpId;
  }

  /**
   * スクリーンオブジェクトバンチDTOリストを取得します。
   * 
   * @return スクリーンオブジェクトバンチDTOリスト
   */
  public List<ScreenObjBunchDto> getScreenObjBunchDtoList() {
    return screenObjBunchDtoList;
  }

  /**
   * スクリーンオブジェクトバンチDTOリストを設定します。
   * 
   * @param screenObjBunchDtoList スクリーンオブジェクトバンチDTOリスト
   */
  public void setScreenObjBunchDtoList(List<ScreenObjBunchDto> screenObjBunchDtoList) {
    this.screenObjBunchDtoList = screenObjBunchDtoList;
  }

}

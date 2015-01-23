package com.melip.common.dto.screen;

import java.util.List;

import com.melip.common.dto.common.AbstractDto;

/**
 * スクリーンオブジェクトグループDTO.
 */
public class ScreenObjGrpDto extends AbstractDto {

  // TODO:スクリーンオブジェクトDTOリストリスト（仮）の名称

  /** レイアウトオブジェクトグループIDのフィールド名 */
  public static final String FIELD_LAYOUT_OBJ_GRP_ID = "layoutObjGrpId";
  /** レイアウトオブジェクトグループエイリアスのフィールド名 */
  public static final String FIELD_LAYOUT_OBJ_GRP_ALIAS = "layoutObjGrpAlias";
  /** 多重度のフィールド名 */
  public static final String FIELD_MULTIPLICITY = "multiplicity";
  /** スクリーンオブジェクトDTOリストリスト（仮）のフィールド名 */
  public static final String FIELD_SCREEN_OBJ_DTO_LIST_LIST = "screenObjDtoListList";

  /** レイアウトオブジェクトグループID */
  private Integer layoutObjGrpId;
  /** レイアウトオブジェクトグループエイリアス */
  private String layoutObjGrpAlias;
  /** 多重度 */
  private String multiplicity;
  /** スクリーンオブジェクトDTOリストリスト（仮） */
  private List<ScreenObjDtoList> screenObjDtoListList;

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
   * スクリーンオブジェクトDTOリストリスト（仮）を取得します。
   * 
   * @return スクリーンオブジェクトDTOリストリスト（仮）
   */
  public List<ScreenObjDtoList> getScreenObjDtoListList() {
    return screenObjDtoListList;
  }

  /**
   * スクリーンオブジェクトDTOリストリスト（仮）を設定します。
   * 
   * @param screenObjDtoListList スクリーンオブジェクトDTOリストリスト（仮）
   */
  public void setScreenObjDtoListList(List<ScreenObjDtoList> screenObjDtoListList) {
    this.screenObjDtoListList = screenObjDtoListList;
  }

}

package com.melip.common.dto.screen;

import java.util.List;

import com.melip.common.dto.common.AbstractDto;
import com.melip.common.dto.common.AttrDto;

/**
 * スクリーンオブジェクトDTO
 */
public class ScreenObjDto extends AbstractDto {

  /** レイアウトオブジェクトIDのフィールド名 */
  public static final String FIELD_LAYOUT_OBJ_ID = "layoutObjId";
  /** レイアウトオブジェクトエイリアスのフィールド名 */
  public static final String FIELD_LAYOUT_OBJ_ALIAS = "layoutObjAlias";
  /** スクリーンオブジェクトIDのフィールド名 */
  public static final String FIELD_SCREEN_OBJ_ID = "screenObjId";
  /** 属性DTOリストのフィールド名 */
  public static final String FIELD_ATTR_DTO_LIST = "attrDtoList";

  /** レイアウトオブジェクトID */
  private Integer layoutObjId;
  /** レイアウトオブジェクトエイリアス */
  private String layoutObjAlias;
  /** スクリーンオブジェクトID */
  private Integer screenObjId;
  /** 属性DTOリスト */
  private List<AttrDto> attrDtoList;

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
   * レイアウトオブジェクトエイリアスを取得します。
   * 
   * @return レイアウトオブジェクトエイリアス
   */
  public String getLayoutObjAlias() {
    return layoutObjAlias;
  }

  /**
   * レイアウトオブジェクトエイリアスを設定します。
   * 
   * @param layoutObjAlias レイアウトオブジェクトエイリアス
   */
  public void setLayoutObjAlias(String layoutObjAlias) {
    this.layoutObjAlias = layoutObjAlias;
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
   * 属性DTOリストを取得します。
   * 
   * @return 属性DTOリスト
   */
  public List<AttrDto> getAttrDtoList() {
    return attrDtoList;
  }

  /**
   * 属性DTOリストを設定します。
   * 
   * @param attrDtoList 属性DTOリスト
   */
  public void setAttrDtoList(List<AttrDto> attrDtoList) {
    this.attrDtoList = attrDtoList;
  }

}

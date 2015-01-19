package com.melip.webservices.dto.screen;

import java.util.ArrayList;

import com.melip.webservices.dto.common.AbstractDto;

/**
 * スクリーンオブジェクトグループDTO.
 */
public class ScreenObjGrpDto extends AbstractDto {

  /** スクリーンオブジェクトDTOリストのフィールド名 */
  public static final String FIELD_SCREEN_OBJ_DTO_LIST = "screenObjDtoList";

  /** スクリーンオブジェクトDTOリスト */
  private ArrayList<ScreenObjDto> screenObjDtoList;

  // シリアルバージョンUID
  private static final long serialVersionUID = 1L;

  /**
   * スクリーンオブジェクトDTOリストを取得します。
   *
   * @return スクリーンオブジェクトDTOリスト
   */
  public ArrayList<ScreenObjDto> getScreenObjDtoList() {
    return screenObjDtoList;
  }

  /**
   * スクリーンオブジェクトDTOリストを設定します。
   *
   * @param screenObjDtoList スクリーンオブジェクトDTOリスト
   */
  public void setScreenObjDtoList(ArrayList<ScreenObjDto> screenObjDtoList) {
    this.screenObjDtoList = screenObjDtoList;
  }

}

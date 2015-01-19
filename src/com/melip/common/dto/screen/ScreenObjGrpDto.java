package com.melip.common.dto.screen;

import java.util.List;

import com.melip.common.dto.common.AbstractDto;

/**
 * スクリーンオブジェクトグループDTO.
 */
public class ScreenObjGrpDto extends AbstractDto {

  /** スクリーンオブジェクトDTOリストのフィールド名 */
  public static final String FIELD_SCREEN_OBJ_DTO_LIST = "screenObjDtoList";

  /** スクリーンオブジェクトDTOリスト */
  private List<ScreenObjDto> screenObjDtoList;

  // シリアルバージョンUID
  private static final long serialVersionUID = 1L;

  /**
   * スクリーンオブジェクトDTOリストを取得します。
   *
   * @return スクリーンオブジェクトDTOリスト
   */
  public List<ScreenObjDto> getScreenObjDtoList() {
    return screenObjDtoList;
  }

  /**
   * スクリーンオブジェクトDTOリストを設定します。
   *
   * @param screenObjDtoList スクリーンオブジェクトDTOリスト
   */
  public void setScreenObjDtoList(List<ScreenObjDto> screenObjDtoList) {
    this.screenObjDtoList = screenObjDtoList;
  }

}

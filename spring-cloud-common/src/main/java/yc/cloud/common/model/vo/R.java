package yc.cloud.common.model.vo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import yc.cloud.common.enums.ResultCode;

/**
 * 返回主体
 *
 * @author: yc
 * @date: 2021-07-07
 */
@Getter
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class R<T> {
    /**
     * 返回码
     */
    private final String code;
    /**
     * 返回信息
     */
    private final String message;
    /**
     * 详情
     */
    private final T detail;

    public static <T> R<T> ofSuccess(T detail) {
        return of(ResultCode.SUCCESS, detail);
    }

    public static <T> R<T> ofSuccess() {
        return of(ResultCode.SUCCESS);
    }

    public static <T> R<T> of(ResultCode resultCode, T detail) {
        return new R<>(resultCode.getCode(), resultCode.getMessage(), detail);
    }

    public static <T> R<T> of(ResultCode resultCode) {
        return new R<>(resultCode.getCode(), resultCode.getMessage(), null);
    }

    public boolean isSuccess() {
        return ResultCode.SUCCESS.name().equals(code);
    }
}

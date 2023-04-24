package functional_programming

import javax.print.attribute.standard.MediaSize.Other

/**
 * 함수를 파라미터로 전달할 때에 오버헤드를 줄일 수 있다.
 */


inline fun Int.add3(other: Int): Int {
    return this + other
}
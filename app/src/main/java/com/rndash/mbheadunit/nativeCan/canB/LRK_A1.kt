
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for LRK_A1 (ID 0x0288)
**/

object LRK_A1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of LRK_A1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.LRK_A1)

	/** Gets LRK LEDs flash due to Disorder **/
	fun get_lrk_stoerg() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.LRK_A1, 2, 1) != 0
	
	/** Sets LRK LEDs flash due to Disorder **/
	fun set_lrk_stoerg(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets Switch on the LED steering wheel heating **/
	fun get_lhzg_led_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.LRK_A1, 1, 1) != 0
	
	/** Sets Switch on the LED steering wheel heating **/
	fun set_lhzg_led_ein(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.LRK_A1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame LRK_A1 (0x0288):
		|	LRK LEDs flash due to Disorder: ${get_lrk_stoerg()}
		|	Switch on the LED steering wheel heating: ${get_lhzg_led_ein()}
	""".trimMargin("|")
}

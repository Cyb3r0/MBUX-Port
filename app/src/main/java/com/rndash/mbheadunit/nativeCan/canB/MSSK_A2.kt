
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MSSK_A2 (ID 0x0208)
**/

object MSSK_A2 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of MSSK_A2
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.MSSK_A2)

	/** Gets passenger seat **/
	fun get_sbf_vor_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A2, 7, 1) != 0
	
	/** Sets passenger seat **/
	fun set_sbf_vor_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 7, 1, if(p) 1 else 0)
	}
	
	/** Gets passenger seat **/
	fun get_sbf_zur_k() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A2, 6, 1) != 0
	
	/** Sets passenger seat **/
	fun set_sbf_zur_k(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 6, 1, if(p) 1 else 0)
	}
	
	/** Gets passenger seat **/
	fun get_sbf_k_tgl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MSSK_A2, 0, 1) != 0
	
	/** Sets passenger seat **/
	fun set_sbf_k_tgl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.MSSK_A2.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame MSSK_A2 (0x0208):
		|	passenger seat: ${get_sbf_vor_k()}
		|	passenger seat: ${get_sbf_zur_k()}
		|	passenger seat: ${get_sbf_k_tgl()}
	""".trimMargin("|")
}

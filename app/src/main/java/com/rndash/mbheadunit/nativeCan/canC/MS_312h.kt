
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MS_312h (ID 0x0312)
**/

object MS_312h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of MS_312h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.MS_312h)

	/** Gets Static motor torque **/
	fun get_m_sta() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_312h, 3, 13)
	
	/** Sets Static motor torque **/
	fun set_m_sta(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 3, 13, p)
	}
	
	/** Gets Maximum motor torque including dyn. Turbocharger share **/
	fun get_m_max_atl() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_312h, 19, 13)
	
	/** Sets Maximum motor torque including dyn. Turbocharger share **/
	fun set_m_max_atl(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 19, 13, p)
	}
	
	/** Gets maximum motor torque **/
	fun get_m_max() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_312h, 35, 13)
	
	/** Sets maximum motor torque **/
	fun set_m_max(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 35, 13, p)
	}
	
	/** Gets minimum motor torque **/
	fun get_m_min() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_312h, 51, 13)
	
	/** Sets minimum motor torque **/
	fun set_m_min(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 51, 13, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.MS_312h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame MS_312h (0x0312):
		|	Static motor torque: ${get_m_sta()}
		|	Maximum motor torque including dyn. Turbocharger share: ${get_m_max_atl()}
		|	maximum motor torque: ${get_m_max()}
		|	minimum motor torque: ${get_m_min()}
	""".trimMargin("|")
}


@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for AAD_580h (ID 0x0580)
**/

object AAD_580h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of AAD_580h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.AAD_580h)

	/** Gets code number acceleration type (> 100: dynamic) **/
	fun get_ftk_bmi() : Int = CanBusNative.getECUParameterC(CanCAddrs.AAD_580h, 0, 8)
	
	/** Sets code number acceleration type (> 100: dynamic) **/
	fun set_ftk_bmi(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 8, p)
	}
	
	/** Gets Code number for lateral acceleration type (> 100: dynamic) **/
	fun get_ftk_lmi() : Int = CanBusNative.getECUParameterC(CanCAddrs.AAD_580h, 8, 8)
	
	/** Sets Code number for lateral acceleration type (> 100: dynamic) **/
	fun set_ftk_lmi(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 8, 8, p)
	}
	
	/** Gets code number brake type (> 100: dynamic) **/
	fun get_ftk_vmi() : Int = CanBusNative.getECUParameterC(CanCAddrs.AAD_580h, 16, 8)
	
	/** Sets code number brake type (> 100: dynamic) **/
	fun set_ftk_vmi(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 16, 8, p)
	}
	
	/** Gets Max.diff. Pedal angle value per maneuver **/
	fun get_ftk_dpw() : Int = CanBusNative.getECUParameterC(CanCAddrs.AAD_580h, 32, 8)
	
	/** Sets Max.diff. Pedal angle value per maneuver **/
	fun set_ftk_dpw(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 32, 8, p)
	}
	
	/** Gets Continuous driver observation **/
	fun get_aadkb() : Int = CanBusNative.getECUParameterC(CanCAddrs.AAD_580h, 40, 8)
	
	/** Sets Continuous driver observation **/
	fun set_aadkb(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 40, 8, p)
	}
	
	/** Gets Spontaneous dynamic demand **/
	fun get_aadkbdyn() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.AAD_580h, 48, 1) != 0
	
	/** Sets Spontaneous dynamic demand **/
	fun set_aadkbdyn(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 48, 1, if(p) 1 else 0)
	}
	
	/** Gets Nervousness **/
	fun get_aadnt() : Int = CanBusNative.getECUParameterC(CanCAddrs.AAD_580h, 56, 8)
	
	/** Sets Nervousness **/
	fun set_aadnt(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 56, 8, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.AAD_580h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame AAD_580h (0x0580):
		|	code number acceleration type (> 100: dynamic): ${get_ftk_bmi()}
		|	Code number for lateral acceleration type (> 100: dynamic): ${get_ftk_lmi()}
		|	code number brake type (> 100: dynamic): ${get_ftk_vmi()}
		|	Max.diff. Pedal angle value per maneuver: ${get_ftk_dpw()}
		|	Continuous driver observation: ${get_aadkb()}
		|	Spontaneous dynamic demand: ${get_aadkbdyn()}
		|	Nervousness: ${get_aadnt()}
	""".trimMargin("|")
}
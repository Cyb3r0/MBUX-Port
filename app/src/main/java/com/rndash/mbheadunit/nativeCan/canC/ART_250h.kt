
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for ART_250h (ID 0x0250)
**/

object ART_250h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of ART_250h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.ART_250h)

	/** Gets Suppression of dynamic full load downshift **/
	fun get_dyn_unt() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 7, 1) != 0
	
	/** Sets Suppression of dynamic full load downshift **/
	fun set_dyn_unt(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 7, 1, if(p) 1 else 0)
	}
	
	/** Gets brake light suppression **/
	fun get_bl_unt() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 6, 1) != 0
	
	/** Sets brake light suppression **/
	fun set_bl_unt(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 6, 1, if(p) 1 else 0)
	}
	
	/** Gets ART brakes **/
	fun get_art_bre() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 5, 1) != 0
	
	/** Sets ART brakes **/
	fun set_art_bre(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 5, 1, if(p) 1 else 0)
	}
	
	/** Gets ART ok **/
	fun get_art_ok() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 4, 1) != 0
	
	/** Sets ART ok **/
	fun set_art_ok(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets switching line shift ART **/
	fun get_slv_art() : SLV_ART = when(CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 0, 4)) {
		 0 -> SLV_ART.SKL0
		 1 -> SLV_ART.SKL1
		 2 -> SLV_ART.SKL2
		 3 -> SLV_ART.SKL3
		 4 -> SLV_ART.SKL4
		 5 -> SLV_ART.SKL5
		 6 -> SLV_ART.SKL6
		 7 -> SLV_ART.SKL7
		 8 -> SLV_ART.SKL8
		 9 -> SLV_ART.SKL9
		 10 -> SLV_ART.SKL10
		 else -> throw Exception("Invalid raw value for SLV_ART")
	}
	
	/** Sets switching line shift ART **/
	fun set_slv_art(f: CanFrame, p: SLV_ART) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 4, p.raw)
	}
	
	/** Gets Cityassistent regulates **/
	fun get_cas_reg() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 10, 1) != 0
	
	/** Sets Cityassistent regulates **/
	fun set_cas_reg(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 10, 1, if(p) 1 else 0)
	}
	
	/** Gets Motor torque request dynamic **/
	fun get_mdyn_art() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 9, 1) != 0
	
	/** Sets Motor torque request dynamic **/
	fun set_mdyn_art(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 9, 1, if(p) 1 else 0)
	}
	
	/** Gets Motor torque request parity (even parity) **/
	fun get_mpar_art() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 8, 1) != 0
	
	/** Sets Motor torque request parity (even parity) **/
	fun set_mpar_art(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 8, 1, if(p) 1 else 0)
	}
	
	/** Gets ART regulates **/
	fun get_art_reg() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 18, 1) != 0
	
	/** Sets ART regulates **/
	fun set_art_reg(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 18, 1, if(p) 1 else 0)
	}
	
	/** Gets Limiter controls **/
	fun get_lim_reg() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 17, 1) != 0
	
	/** Sets Limiter controls **/
	fun set_lim_reg(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 17, 1, if(p) 1 else 0)
	}
	
	/** Gets Required. Engine torque **/
	fun get_m_art() : Int = CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 19, 13)
	
	/** Sets Required. Engine torque **/
	fun set_m_art(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 19, 13, p)
	}
	
	/** Gets message counter **/
	fun get_bz250h() : Int = CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 32, 4)
	
	/** Sets message counter **/
	fun set_bz250h(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 32, 4, p)
	}
	
	/** Gets braking torque (0000h: passive value) **/
	fun get_mbre_art() : Int = CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 36, 12)
	
	/** Sets braking torque (0000h: passive value) **/
	fun set_mbre_art(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 36, 12, p)
	}
	
	/** Gets target gear, lower limit **/
	fun get_gmin_art() : GMIN_ART = when(CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 53, 3)) {
		 0 -> GMIN_ART.PASSIVE
		 1 -> GMIN_ART.G1
		 2 -> GMIN_ART.G2
		 3 -> GMIN_ART.G3
		 4 -> GMIN_ART.G4
		 5 -> GMIN_ART.G5
		 6 -> GMIN_ART.G6
		 7 -> GMIN_ART.G7
		 else -> throw Exception("Invalid raw value for GMIN_ART")
	}
	
	/** Sets target gear, lower limit **/
	fun set_gmin_art(f: CanFrame, p: GMIN_ART) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 53, 3, p.raw)
	}
	
	/** Gets target gear, upper limit **/
	fun get_gmax_art() : GMAX_ART = when(CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 50, 3)) {
		 0 -> GMAX_ART.PASSIVE
		 1 -> GMAX_ART.G1
		 2 -> GMAX_ART.G2
		 3 -> GMAX_ART.G3
		 4 -> GMAX_ART.G4
		 5 -> GMAX_ART.G5
		 6 -> GMAX_ART.G6
		 7 -> GMAX_ART.G7
		 else -> throw Exception("Invalid raw value for GMAX_ART")
	}
	
	/** Sets target gear, upper limit **/
	fun set_gmax_art(f: CanFrame, p: GMAX_ART) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 50, 3, p.raw)
	}
	
	/** Gets ART request: "Active downshift" **/
	fun get_akt_r_art() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.ART_250h, 48, 1) != 0
	
	/** Sets ART request: "Active downshift" **/
	fun set_akt_r_art(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 48, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.ART_250h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame ART_250h (0x0250):
		|	Suppression of dynamic full load downshift: ${get_dyn_unt()}
		|	brake light suppression: ${get_bl_unt()}
		|	ART brakes: ${get_art_bre()}
		|	ART ok: ${get_art_ok()}
		|	switching line shift ART: ${get_slv_art()}
		|	Cityassistent regulates: ${get_cas_reg()}
		|	Motor torque request dynamic: ${get_mdyn_art()}
		|	Motor torque request parity (even parity): ${get_mpar_art()}
		|	ART regulates: ${get_art_reg()}
		|	Limiter controls: ${get_lim_reg()}
		|	Required. Engine torque: ${get_m_art()}
		|	message counter: ${get_bz250h()}
		|	braking torque (0000h: passive value): ${get_mbre_art()}
		|	target gear, lower limit: ${get_gmin_art()}
		|	target gear, upper limit: ${get_gmax_art()}
		|	ART request: "Active downshift": ${get_akt_r_art()}
	""".trimMargin("|")
}

@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for KOMBI_408h (ID 0x0408)
**/

object KOMBI_408h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of KOMBI_408h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.KOMBI_408h)

	/** Gets tank level **/
	fun get_tank_fs() : Int = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 0, 8)
	
	/** Sets tank level **/
	fun set_tank_fs(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 8, p)
	}
	
	/** Gets Terminal 61 decoupled **/
	fun get_kl_61e() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 15, 1) != 0
	
	/** Sets Terminal 61 decoupled **/
	fun set_kl_61e(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 15, 1, if(p) 1 else 0)
	}
	
	/** Gets minimum tank level **/
	fun get_tfsm() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 14, 1) != 0
	
	/** Sets minimum tank level **/
	fun set_tfsm(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 14, 1, if(p) 1 else 0)
	}
	
	/** Gets Pre-glow control lamp defective **/
	fun get_vgl_kl_def() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 13, 1) != 0
	
	/** Sets Pre-glow control lamp defective **/
	fun set_vgl_kl_def(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 13, 1, if(p) 1 else 0)
	}
	
	/** Gets air conditioning available **/
	fun get_kla_vh() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 12, 1) != 0
	
	/** Sets air conditioning available **/
	fun set_kla_vh(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 12, 1, if(p) 1 else 0)
	}
	
	/** Gets mph instead of km / h (variable speed limit) **/
	fun get_v_mph() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 11, 1) != 0
	
	/** Sets mph instead of km / h (variable speed limit) **/
	fun set_v_mph(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 11, 1, if(p) 1 else 0)
	}
	
	/** Gets Tacho calibration **/
	fun get_tacho_sym() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 10, 1) != 0
	
	/** Sets Tacho calibration **/
	fun set_tacho_sym(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 10, 1, if(p) 1 else 0)
	}
	
	/** Gets Speed ​​limiter / tempomat display not possible **/
	fun get_v_dspl_aus() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 9, 1) != 0
	
	/** Sets Speed ​​limiter / tempomat display not possible **/
	fun set_v_dspl_aus(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 9, 1, if(p) 1 else 0)
	}
	
	/** Gets driver's door open **/
	fun get_tf_auf() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 8, 1) != 0
	
	/** Sets driver's door open **/
	fun set_tf_auf(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 8, 1, if(p) 1 else 0)
	}
	
	/** Gets Raw outside air temperature **/
	fun get_t_aussen() : Int = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 16, 8)
	
	/** Sets Raw outside air temperature **/
	fun set_t_aussen(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 16, 8, p)
	}
	
	/** Gets Terminal 58 dimmed **/
	fun get_kl_58d() : Int = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 24, 8)
	
	/** Sets Terminal 58 dimmed **/
	fun set_kl_58d(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 24, 8, p)
	}
	
	/** Gets engine shutdown time (is sent from terminal 15) **/
	fun get_maz() : Int = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 32, 8)
	
	/** Sets engine shutdown time (is sent from terminal 15) **/
	fun set_maz(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 32, 8, p)
	}
	
	/** Gets mileage **/
	fun get_km16() : Int = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 40, 16)
	
	/** Sets mileage **/
	fun set_km16(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 40, 16, p)
	}
	
	/** Gets maximum winter tire speed with 4 bits **/
	fun get_wrc() : WRC = when(CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 61, 3)) {
		 0 -> WRC.UBG
		 1 -> WRC.BG210
		 2 -> WRC.BG190
		 3 -> WRC.BG160
		 4 -> WRC.BG240
		 5 -> WRC.BG230
		 6 -> WRC.BG220
		 7 -> WRC.BG200
		 128 -> WRC.BG180
		 129 -> WRC.BG170
		 130 -> WRC.BG150
		 131 -> WRC.BG140
		 132 -> WRC.BG130
		 133 -> WRC.BG120
		 134 -> WRC.BG110
		 135 -> WRC.BG100
		 else -> throw Exception("Invalid raw value for WRC")
	}
	
	/** Sets maximum winter tire speed with 4 bits **/
	fun set_wrc(f: CanFrame, p: WRC) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 61, 3, p.raw)
	}
	
	/** Gets Activate roller test mode ESP **/
	fun get_rt_ein() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 60, 1) != 0
	
	/** Sets Activate roller test mode ESP **/
	fun set_rt_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 60, 1, if(p) 1 else 0)
	}
	
	/** Gets Enable auxiliary heater **/
	fun get_zh_freig() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 59, 1) != 0
	
	/** Sets Enable auxiliary heater **/
	fun set_zh_freig(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 59, 1, if(p) 1 else 0)
	}
	
	/** Gets segment tachometer available **/
	fun get_sgt_vh() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 58, 1) != 0
	
	/** Sets segment tachometer available **/
	fun set_sgt_vh(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 58, 1, if(p) 1 else 0)
	}
	
	/** Gets Speed ​​limiter / cruise control display active **/
	fun get_v_dspl_akt() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 57, 1) != 0
	
	/** Sets Speed ​​limiter / cruise control display active **/
	fun set_v_dspl_akt(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 57, 1, if(p) 1 else 0)
	}
	
	/** Gets Winter tire maximum speed bit 3 **/
	fun get_wrc3() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_408h, 56, 1) != 0
	
	/** Sets Winter tire maximum speed bit 3 **/
	fun set_wrc3(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 56, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.KOMBI_408h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame KOMBI_408h (0x0408):
		|	tank level: ${get_tank_fs()}
		|	Terminal 61 decoupled: ${get_kl_61e()}
		|	minimum tank level: ${get_tfsm()}
		|	Pre-glow control lamp defective: ${get_vgl_kl_def()}
		|	air conditioning available: ${get_kla_vh()}
		|	mph instead of km / h (variable speed limit): ${get_v_mph()}
		|	Tacho calibration: ${get_tacho_sym()}
		|	Speed ​​limiter / tempomat display not possible: ${get_v_dspl_aus()}
		|	driver's door open: ${get_tf_auf()}
		|	Raw outside air temperature: ${get_t_aussen()}
		|	Terminal 58 dimmed: ${get_kl_58d()}
		|	engine shutdown time (is sent from terminal 15): ${get_maz()}
		|	mileage: ${get_km16()}
		|	maximum winter tire speed with 4 bits: ${get_wrc()}
		|	Activate roller test mode ESP: ${get_rt_ein()}
		|	Enable auxiliary heater: ${get_zh_freig()}
		|	segment tachometer available: ${get_sgt_vh()}
		|	Speed ​​limiter / cruise control display active: ${get_v_dspl_akt()}
		|	Winter tire maximum speed bit 3: ${get_wrc3()}
	""".trimMargin("|")
}
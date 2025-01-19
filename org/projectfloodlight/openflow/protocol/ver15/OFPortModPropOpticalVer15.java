// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver15;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.stat.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.oxs.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFPortModPropOpticalVer15 implements OFPortModPropOptical {
    private static final Logger logger = LoggerFactory.getLogger(OFPortModPropOpticalVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int LENGTH = 24;

        private final static long DEFAULT_CONFIGURE = 0x0L;
        private final static long DEFAULT_FREQ_LDMA = 0x0L;
        private final static long DEFAULT_FL_OFFSET = 0x0L;
        private final static long DEFAULT_GRID_SPAN = 0x0L;
        private final static long DEFAULT_TX_PWR = 0x0L;

    // OF message fields
    private final long configure;
    private final long freqLdma;
    private final long flOffset;
    private final long gridSpan;
    private final long txPwr;
//
    // Immutable default instance
    final static OFPortModPropOpticalVer15 DEFAULT = new OFPortModPropOpticalVer15(
        DEFAULT_CONFIGURE, DEFAULT_FREQ_LDMA, DEFAULT_FL_OFFSET, DEFAULT_GRID_SPAN, DEFAULT_TX_PWR
    );

    // package private constructor - used by readers, builders, and factory
    OFPortModPropOpticalVer15(long configure, long freqLdma, long flOffset, long gridSpan, long txPwr) {
        this.configure = U32.normalize(configure);
        this.freqLdma = U32.normalize(freqLdma);
        this.flOffset = U32.normalize(flOffset);
        this.gridSpan = U32.normalize(gridSpan);
        this.txPwr = U32.normalize(txPwr);
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public long getConfigure() {
        return configure;
    }

    @Override
    public long getFreqLdma() {
        return freqLdma;
    }

    @Override
    public long getFlOffset() {
        return flOffset;
    }

    @Override
    public long getGridSpan() {
        return gridSpan;
    }

    @Override
    public long getTxPwr() {
        return txPwr;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFPortModPropOptical.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortModPropOptical.Builder {
        final OFPortModPropOpticalVer15 parentMessage;

        // OF message fields
        private boolean configureSet;
        private long configure;
        private boolean freqLdmaSet;
        private long freqLdma;
        private boolean flOffsetSet;
        private long flOffset;
        private boolean gridSpanSet;
        private long gridSpan;
        private boolean txPwrSet;
        private long txPwr;

        BuilderWithParent(OFPortModPropOpticalVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public long getConfigure() {
        return configure;
    }

    @Override
    public OFPortModPropOptical.Builder setConfigure(long configure) {
        this.configure = configure;
        this.configureSet = true;
        return this;
    }
    @Override
    public long getFreqLdma() {
        return freqLdma;
    }

    @Override
    public OFPortModPropOptical.Builder setFreqLdma(long freqLdma) {
        this.freqLdma = freqLdma;
        this.freqLdmaSet = true;
        return this;
    }
    @Override
    public long getFlOffset() {
        return flOffset;
    }

    @Override
    public OFPortModPropOptical.Builder setFlOffset(long flOffset) {
        this.flOffset = flOffset;
        this.flOffsetSet = true;
        return this;
    }
    @Override
    public long getGridSpan() {
        return gridSpan;
    }

    @Override
    public OFPortModPropOptical.Builder setGridSpan(long gridSpan) {
        this.gridSpan = gridSpan;
        this.gridSpanSet = true;
        return this;
    }
    @Override
    public long getTxPwr() {
        return txPwr;
    }

    @Override
    public OFPortModPropOptical.Builder setTxPwr(long txPwr) {
        this.txPwr = txPwr;
        this.txPwrSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFPortModPropOptical build() {
                long configure = this.configureSet ? this.configure : parentMessage.configure;
                long freqLdma = this.freqLdmaSet ? this.freqLdma : parentMessage.freqLdma;
                long flOffset = this.flOffsetSet ? this.flOffset : parentMessage.flOffset;
                long gridSpan = this.gridSpanSet ? this.gridSpan : parentMessage.gridSpan;
                long txPwr = this.txPwrSet ? this.txPwr : parentMessage.txPwr;

                //
                return new OFPortModPropOpticalVer15(
                    configure,
                    freqLdma,
                    flOffset,
                    gridSpan,
                    txPwr
                );
        }

    }

    static class Builder implements OFPortModPropOptical.Builder {
        // OF message fields
        private boolean configureSet;
        private long configure;
        private boolean freqLdmaSet;
        private long freqLdma;
        private boolean flOffsetSet;
        private long flOffset;
        private boolean gridSpanSet;
        private long gridSpan;
        private boolean txPwrSet;
        private long txPwr;

    @Override
    public int getType() {
        return 0x1;
    }

    @Override
    public long getConfigure() {
        return configure;
    }

    @Override
    public OFPortModPropOptical.Builder setConfigure(long configure) {
        this.configure = configure;
        this.configureSet = true;
        return this;
    }
    @Override
    public long getFreqLdma() {
        return freqLdma;
    }

    @Override
    public OFPortModPropOptical.Builder setFreqLdma(long freqLdma) {
        this.freqLdma = freqLdma;
        this.freqLdmaSet = true;
        return this;
    }
    @Override
    public long getFlOffset() {
        return flOffset;
    }

    @Override
    public OFPortModPropOptical.Builder setFlOffset(long flOffset) {
        this.flOffset = flOffset;
        this.flOffsetSet = true;
        return this;
    }
    @Override
    public long getGridSpan() {
        return gridSpan;
    }

    @Override
    public OFPortModPropOptical.Builder setGridSpan(long gridSpan) {
        this.gridSpan = gridSpan;
        this.gridSpanSet = true;
        return this;
    }
    @Override
    public long getTxPwr() {
        return txPwr;
    }

    @Override
    public OFPortModPropOptical.Builder setTxPwr(long txPwr) {
        this.txPwr = txPwr;
        this.txPwrSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFPortModPropOptical build() {
            long configure = this.configureSet ? this.configure : DEFAULT_CONFIGURE;
            long freqLdma = this.freqLdmaSet ? this.freqLdma : DEFAULT_FREQ_LDMA;
            long flOffset = this.flOffsetSet ? this.flOffset : DEFAULT_FL_OFFSET;
            long gridSpan = this.gridSpanSet ? this.gridSpan : DEFAULT_GRID_SPAN;
            long txPwr = this.txPwrSet ? this.txPwr : DEFAULT_TX_PWR;


            return new OFPortModPropOpticalVer15(
                    configure,
                    freqLdma,
                    flOffset,
                    gridSpan,
                    txPwr
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFPortModPropOptical> {
        @Override
        public OFPortModPropOptical readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x1
            short type = bb.readShort();
            if(type != (short) 0x1)
                throw new OFParseError("Wrong type: Expected=0x1(0x1), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 24)
                throw new OFParseError("Wrong length: Expected=24(24), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long configure = U32.f(bb.readInt());
            long freqLdma = U32.f(bb.readInt());
            long flOffset = U32.f(bb.readInt());
            long gridSpan = U32.f(bb.readInt());
            long txPwr = U32.f(bb.readInt());

            OFPortModPropOpticalVer15 portModPropOpticalVer15 = new OFPortModPropOpticalVer15(
                    configure,
                      freqLdma,
                      flOffset,
                      gridSpan,
                      txPwr
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portModPropOpticalVer15);
            return portModPropOpticalVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortModPropOpticalVer15Funnel FUNNEL = new OFPortModPropOpticalVer15Funnel();
    static class OFPortModPropOpticalVer15Funnel implements Funnel<OFPortModPropOpticalVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortModPropOpticalVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0x1
            sink.putShort((short) 0x1);
            // fixed value property length = 24
            sink.putShort((short) 0x18);
            sink.putLong(message.configure);
            sink.putLong(message.freqLdma);
            sink.putLong(message.flOffset);
            sink.putLong(message.gridSpan);
            sink.putLong(message.txPwr);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortModPropOpticalVer15> {
        @Override
        public void write(ByteBuf bb, OFPortModPropOpticalVer15 message) {
            // fixed value property type = 0x1
            bb.writeShort((short) 0x1);
            // fixed value property length = 24
            bb.writeShort((short) 0x18);
            bb.writeInt(U32.t(message.configure));
            bb.writeInt(U32.t(message.freqLdma));
            bb.writeInt(U32.t(message.flOffset));
            bb.writeInt(U32.t(message.gridSpan));
            bb.writeInt(U32.t(message.txPwr));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortModPropOpticalVer15(");
        b.append("configure=").append(configure);
        b.append(", ");
        b.append("freqLdma=").append(freqLdma);
        b.append(", ");
        b.append("flOffset=").append(flOffset);
        b.append(", ");
        b.append("gridSpan=").append(gridSpan);
        b.append(", ");
        b.append("txPwr=").append(txPwr);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFPortModPropOpticalVer15 other = (OFPortModPropOpticalVer15) obj;

        if( configure != other.configure)
            return false;
        if( freqLdma != other.freqLdma)
            return false;
        if( flOffset != other.flOffset)
            return false;
        if( gridSpan != other.gridSpan)
            return false;
        if( txPwr != other.txPwr)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (configure ^ (configure >>> 32));
        result = prime *  (int) (freqLdma ^ (freqLdma >>> 32));
        result = prime *  (int) (flOffset ^ (flOffset >>> 32));
        result = prime *  (int) (gridSpan ^ (gridSpan >>> 32));
        result = prime *  (int) (txPwr ^ (txPwr >>> 32));
        return result;
    }

}

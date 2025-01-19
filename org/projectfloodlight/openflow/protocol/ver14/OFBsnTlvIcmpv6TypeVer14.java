// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver14;

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

class OFBsnTlvIcmpv6TypeVer14 implements OFBsnTlvIcmpv6Type {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvIcmpv6TypeVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 5;

        private final static short DEFAULT_VALUE = (short) 0x0;

    // OF message fields
    private final short value;
//
    // Immutable default instance
    final static OFBsnTlvIcmpv6TypeVer14 DEFAULT = new OFBsnTlvIcmpv6TypeVer14(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvIcmpv6TypeVer14(short value) {
        this.value = U8.normalize(value);
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0xcc;
    }

    @Override
    public short getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBsnTlvIcmpv6Type.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvIcmpv6Type.Builder {
        final OFBsnTlvIcmpv6TypeVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private short value;

        BuilderWithParent(OFBsnTlvIcmpv6TypeVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0xcc;
    }

    @Override
    public short getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIcmpv6Type.Builder setValue(short value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBsnTlvIcmpv6Type build() {
                short value = this.valueSet ? this.value : parentMessage.value;

                //
                return new OFBsnTlvIcmpv6TypeVer14(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvIcmpv6Type.Builder {
        // OF message fields
        private boolean valueSet;
        private short value;

    @Override
    public int getType() {
        return 0xcc;
    }

    @Override
    public short getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIcmpv6Type.Builder setValue(short value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFBsnTlvIcmpv6Type build() {
            short value = this.valueSet ? this.value : DEFAULT_VALUE;


            return new OFBsnTlvIcmpv6TypeVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvIcmpv6Type> {
        @Override
        public OFBsnTlvIcmpv6Type readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0xcc
            short type = bb.readShort();
            if(type != (short) 0xcc)
                throw new OFParseError("Wrong type: Expected=0xcc(0xcc), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 5)
                throw new OFParseError("Wrong length: Expected=5(5), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            short value = U8.f(bb.readByte());

            OFBsnTlvIcmpv6TypeVer14 bsnTlvIcmpv6TypeVer14 = new OFBsnTlvIcmpv6TypeVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvIcmpv6TypeVer14);
            return bsnTlvIcmpv6TypeVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvIcmpv6TypeVer14Funnel FUNNEL = new OFBsnTlvIcmpv6TypeVer14Funnel();
    static class OFBsnTlvIcmpv6TypeVer14Funnel implements Funnel<OFBsnTlvIcmpv6TypeVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvIcmpv6TypeVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0xcc
            sink.putShort((short) 0xcc);
            // fixed value property length = 5
            sink.putShort((short) 0x5);
            sink.putShort(message.value);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvIcmpv6TypeVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvIcmpv6TypeVer14 message) {
            // fixed value property type = 0xcc
            bb.writeShort((short) 0xcc);
            // fixed value property length = 5
            bb.writeShort((short) 0x5);
            bb.writeByte(U8.t(message.value));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvIcmpv6TypeVer14(");
        b.append("value=").append(value);
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
        OFBsnTlvIcmpv6TypeVer14 other = (OFBsnTlvIcmpv6TypeVer14) obj;

        if( value != other.value)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + value;
        return result;
    }

}

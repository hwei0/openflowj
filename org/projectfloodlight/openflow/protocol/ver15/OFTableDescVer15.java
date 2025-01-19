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
import com.google.common.collect.ImmutableSet;
import java.util.List;
import com.google.common.collect.ImmutableList;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFTableDescVer15 implements OFTableDesc {
    private static final Logger logger = LoggerFactory.getLogger(OFTableDescVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 8;
    // maximum OF message length: 16 bit, unsigned
    final static int MAXIMUM_LENGTH = 0xFFFF;

        private final static TableId DEFAULT_TABLE_ID = TableId.ALL;
        private final static Set<OFTableConfig> DEFAULT_CONFIG = ImmutableSet.<OFTableConfig>of();
        private final static List<OFTableModProp> DEFAULT_PROPERTIES = ImmutableList.<OFTableModProp>of();

    // OF message fields
    private final TableId tableId;
    private final Set<OFTableConfig> config;
    private final List<OFTableModProp> properties;
//
    // Immutable default instance
    final static OFTableDescVer15 DEFAULT = new OFTableDescVer15(
        DEFAULT_TABLE_ID, DEFAULT_CONFIG, DEFAULT_PROPERTIES
    );

    // package private constructor - used by readers, builders, and factory
    OFTableDescVer15(TableId tableId, Set<OFTableConfig> config, List<OFTableModProp> properties) {
        if(tableId == null) {
            throw new NullPointerException("OFTableDescVer15: property tableId cannot be null");
        }
        if(config == null) {
            throw new NullPointerException("OFTableDescVer15: property config cannot be null");
        }
        if(properties == null) {
            throw new NullPointerException("OFTableDescVer15: property properties cannot be null");
        }
        this.tableId = tableId;
        this.config = config;
        this.properties = properties;
    }

    // Accessors for OF message fields
    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public Set<OFTableConfig> getConfig() {
        return config;
    }

    @Override
    public List<OFTableModProp> getProperties() {
        return properties;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFTableDesc.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFTableDesc.Builder {
        final OFTableDescVer15 parentMessage;

        // OF message fields
        private boolean tableIdSet;
        private TableId tableId;
        private boolean configSet;
        private Set<OFTableConfig> config;
        private boolean propertiesSet;
        private List<OFTableModProp> properties;

        BuilderWithParent(OFTableDescVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFTableDesc.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public Set<OFTableConfig> getConfig() {
        return config;
    }

    @Override
    public OFTableDesc.Builder setConfig(Set<OFTableConfig> config) {
        this.config = config;
        this.configSet = true;
        return this;
    }
    @Override
    public List<OFTableModProp> getProperties() {
        return properties;
    }

    @Override
    public OFTableDesc.Builder setProperties(List<OFTableModProp> properties) {
        this.properties = properties;
        this.propertiesSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFTableDesc build() {
                TableId tableId = this.tableIdSet ? this.tableId : parentMessage.tableId;
                if(tableId == null)
                    throw new NullPointerException("Property tableId must not be null");
                Set<OFTableConfig> config = this.configSet ? this.config : parentMessage.config;
                if(config == null)
                    throw new NullPointerException("Property config must not be null");
                List<OFTableModProp> properties = this.propertiesSet ? this.properties : parentMessage.properties;
                if(properties == null)
                    throw new NullPointerException("Property properties must not be null");

                //
                return new OFTableDescVer15(
                    tableId,
                    config,
                    properties
                );
        }

    }

    static class Builder implements OFTableDesc.Builder {
        // OF message fields
        private boolean tableIdSet;
        private TableId tableId;
        private boolean configSet;
        private Set<OFTableConfig> config;
        private boolean propertiesSet;
        private List<OFTableModProp> properties;

    @Override
    public TableId getTableId() {
        return tableId;
    }

    @Override
    public OFTableDesc.Builder setTableId(TableId tableId) {
        this.tableId = tableId;
        this.tableIdSet = true;
        return this;
    }
    @Override
    public Set<OFTableConfig> getConfig() {
        return config;
    }

    @Override
    public OFTableDesc.Builder setConfig(Set<OFTableConfig> config) {
        this.config = config;
        this.configSet = true;
        return this;
    }
    @Override
    public List<OFTableModProp> getProperties() {
        return properties;
    }

    @Override
    public OFTableDesc.Builder setProperties(List<OFTableModProp> properties) {
        this.properties = properties;
        this.propertiesSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFTableDesc build() {
            TableId tableId = this.tableIdSet ? this.tableId : DEFAULT_TABLE_ID;
            if(tableId == null)
                throw new NullPointerException("Property tableId must not be null");
            Set<OFTableConfig> config = this.configSet ? this.config : DEFAULT_CONFIG;
            if(config == null)
                throw new NullPointerException("Property config must not be null");
            List<OFTableModProp> properties = this.propertiesSet ? this.properties : DEFAULT_PROPERTIES;
            if(properties == null)
                throw new NullPointerException("Property properties must not be null");


            return new OFTableDescVer15(
                    tableId,
                    config,
                    properties
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFTableDesc> {
        @Override
        public OFTableDesc readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            TableId tableId = TableId.readByte(bb);
            // pad: 1 bytes
            bb.skipBytes(1);
            Set<OFTableConfig> config = OFTableConfigSerializerVer15.readFrom(bb);
            List<OFTableModProp> properties = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFTableModPropVer15.READER);

            OFTableDescVer15 tableDescVer15 = new OFTableDescVer15(
                    tableId,
                      config,
                      properties
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", tableDescVer15);
            return tableDescVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFTableDescVer15Funnel FUNNEL = new OFTableDescVer15Funnel();
    static class OFTableDescVer15Funnel implements Funnel<OFTableDescVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFTableDescVer15 message, PrimitiveSink sink) {
            // FIXME: skip funnel of length
            message.tableId.putTo(sink);
            // skip pad (1 bytes)
            OFTableConfigSerializerVer15.putTo(message.config, sink);
            FunnelUtils.putList(message.properties, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFTableDescVer15> {
        @Override
        public void write(ByteBuf bb, OFTableDescVer15 message) {
            int startIndex = bb.writerIndex();
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            message.tableId.writeByte(bb);
            // pad: 1 bytes
            bb.writeZero(1);
            OFTableConfigSerializerVer15.writeTo(bb, message.config);
            ChannelUtils.writeList(bb, message.properties);

            // update length field
            int length = bb.writerIndex() - startIndex;
            if (length > MAXIMUM_LENGTH) {
                throw new IllegalArgumentException("OFTableDescVer15: message length (" + length + ") exceeds maximum (0xFFFF)");
            }
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFTableDescVer15(");
        b.append("tableId=").append(tableId);
        b.append(", ");
        b.append("config=").append(config);
        b.append(", ");
        b.append("properties=").append(properties);
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
        OFTableDescVer15 other = (OFTableDescVer15) obj;

        if (tableId == null) {
            if (other.tableId != null)
                return false;
        } else if (!tableId.equals(other.tableId))
            return false;
        if (config == null) {
            if (other.config != null)
                return false;
        } else if (!config.equals(other.config))
            return false;
        if (properties == null) {
            if (other.properties != null)
                return false;
        } else if (!properties.equals(other.properties))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((tableId == null) ? 0 : tableId.hashCode());
        result = prime * result + ((config == null) ? 0 : config.hashCode());
        result = prime * result + ((properties == null) ? 0 : properties.hashCode());
        return result;
    }

}

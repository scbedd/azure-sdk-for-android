package com.azure.android.storage.blob.models;

import com.azure.android.core.annotation.HeaderCollection;
import com.azure.android.core.util.CoreUtils;
import com.azure.android.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import org.threeten.bp.OffsetDateTime;

import java.util.Map;

/**
 * Defines headers for Download operation.
 */
@JacksonXmlRootElement(localName = "Blob-Download-Headers")
public final class BlobDownloadHeaders {
    /**
     * Returns the date and time the container was last modified. Any operation
     * that modifies the blob, including an update of the blob's metadata or
     * properties, changes the last-modified time of the blob.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /**
     * The metadata property.
     */
    @HeaderCollection("x-ms-meta-")
    private Map<String, String> metadata;

    /**
     * The number of bytes present in the response body.
     */
    @JsonProperty(value = "Content-Length")
    private Long contentLength;

    /**
     * The media type of the body of the response. For Download Blob this is
     * 'application/octet-stream'
     */
    @JsonProperty(value = "Content-Type")
    private String contentType;

    /**
     * Indicates the range of bytes returned in the event that the client
     * requested a subset of the blob by setting the 'Range' request header.
     */
    @JsonProperty(value = "Content-Range")
    private String contentRange;

    /**
     * The ETag contains a value that you can use to perform operations
     * conditionally. If the request version is 2011-08-18 or newer, the ETag
     * value will be in quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * If the blob has an MD5 hash and this operation is to read the full blob,
     * this response header is returned so that the client can check for
     * message content integrity.
     */
    @JsonProperty(value = "Content-MD5")
    private byte[] contentMd5;

    /**
     * This header returns the value that was specified for the
     * Content-Encoding request header
     */
    @JsonProperty(value = "Content-Encoding")
    private String contentEncoding;

    /**
     * This header is returned if it was previously specified for the blob.
     */
    @JsonProperty(value = "Cache-Control")
    private String cacheControl;

    /**
     * This header returns the value that was specified for the
     * 'x-ms-blob-content-disposition' header. The Content-Disposition response
     * header field conveys additional information about how to process the
     * response payload, and also can be used to attach additional metadata.
     * For example, if set to attachment, it indicates that the user-agent
     * should not display the response, but instead show a Save As dialog with
     * a filename other than the blob name specified.
     */
    @JsonProperty(value = "Content-Disposition")
    private String contentDisposition;

    /**
     * This header returns the value that was specified for the
     * Content-Language request header.
     */
    @JsonProperty(value = "Content-Language")
    private String contentLanguage;

    /**
     * The current sequence number for a page blob. This header is not returned
     * for block blobs or append blobs
     */
    @JsonProperty(value = "x-ms-blob-sequence-number")
    private Long blobSequenceNumber;

    /**
     * The blob's type. Possible values include: 'BlockBlob', 'PageBlob',
     * 'AppendBlob'
     */
    @JsonProperty(value = "x-ms-blob-type")
    private BlobType blobType;

    /**
     * Conclusion time of the last attempted Copy Blob operation where this
     * blob was the destination blob. This value can specify the time of a
     * completed, aborted, or failed copy attempt. This header does not appear
     * if a copy is pending, if this blob has never been the destination in a
     * Copy Blob operation, or if this blob has been modified after a concluded
     * Copy Blob operation using Set Blob Properties, Put Blob, or Put Block
     * List.
     */
    @JsonProperty(value = "x-ms-copy-completion-time")
    private DateTimeRfc1123 copyCompletionTime;

    /**
     * Only appears when x-ms-copy-status is failed or pending. Describes the
     * cause of the last fatal or non-fatal copy operation failure. This header
     * does not appear if this blob has never been the destination in a Copy
     * Blob operation, or if this blob has been modified after a concluded Copy
     * Blob operation using Set Blob Properties, Put Blob, or Put Block List
     */
    @JsonProperty(value = "x-ms-copy-status-description")
    private String copyStatusDescription;

    /**
     * String identifier for this copy operation. Use with Get Blob Properties
     * to check the status of this copy operation, or pass to Abort Copy Blob
     * to abort a pending copy.
     */
    @JsonProperty(value = "x-ms-copy-id")
    private String copyId;

    /**
     * Contains the number of bytes copied and the total bytes in the source in
     * the last attempted Copy Blob operation where this blob was the
     * destination blob. Can show between 0 and Content-Length bytes copied.
     * This header does not appear if this blob has never been the destination
     * in a Copy Blob operation, or if this blob has been modified after a
     * concluded Copy Blob operation using Set Blob Properties, Put Blob, or
     * Put Block List
     */
    @JsonProperty(value = "x-ms-copy-progress")
    private String copyProgress;

    /**
     * URL up to 2 KB in length that specifies the source blob or file used in
     * the last attempted Copy Blob operation where this blob was the
     * destination blob. This header does not appear if this blob has never
     * been the destination in a Copy Blob operation, or if this blob has been
     * modified after a concluded Copy Blob operation using Set Blob
     * Properties, Put Blob, or Put Block List.
     */
    @JsonProperty(value = "x-ms-copy-source")
    private String copySource;

    /**
     * State of the copy operation identified by x-ms-copy-id. Possible values
     * include: 'pending', 'success', 'aborted', 'failed'
     */
    @JsonProperty(value = "x-ms-copy-status")
    private CopyStatusType copyStatus;

    /**
     * When a blob is leased, specifies whether the lease is of infinite or
     * fixed duration. Possible values include: 'infinite', 'fixed'
     */
    @JsonProperty(value = "x-ms-lease-duration")
    private LeaseDurationType leaseDuration;

    /**
     * Lease state of the blob. Possible values include: 'available', 'leased',
     * 'expired', 'breaking', 'broken'
     */
    @JsonProperty(value = "x-ms-lease-state")
    private LeaseStateType leaseState;

    /**
     * The current lease status of the blob. Possible values include: 'locked',
     * 'unlocked'
     */
    @JsonProperty(value = "x-ms-lease-status")
    private LeaseStatusType leaseStatus;

    /**
     * If a client request id header is sent in the request, this header will
     * be present in the response with the same value.
     */
    @JsonProperty(value = "x-ms-client-request-id")
    private String clientRequestId;

    /**
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /**
     * Indicates the version of the Blob service used to execute the request.
     * This header is returned for requests made against version 2009-09-19 and
     * above.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /**
     * Indicates that the service supports requests for partial blob content.
     */
    @JsonProperty(value = "Accept-Ranges")
    private String acceptRanges;

    /**
     * UTC date/time value generated by the service that indicates the time at
     * which the response was initiated
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /**
     * The number of committed blocks present in the blob. This header is
     * returned only for append blobs.
     */
    @JsonProperty(value = "x-ms-blob-committed-block-count")
    private Integer blobCommittedBlockCount;

    /**
     * The value of this header is set to true if the blob data and application
     * metadata are completely encrypted using the specified algorithm.
     * Otherwise, the value is set to false (when the blob is unencrypted, or
     * if only parts of the blob/application metadata are encrypted).
     */
    @JsonProperty(value = "x-ms-server-encrypted")
    private Boolean isServerEncrypted;

    /**
     * The SHA-256 hash of the encryption key used to encrypt the blob. This
     * header is only returned when the blob was encrypted with a
     * customer-provided key.
     */
    @JsonProperty(value = "x-ms-encryption-key-sha256")
    private String encryptionKeySha256;

    /**
     * Returns the name of the encryption scope used to encrypt the blob
     * contents and application metadata.  Note that the absence of this header
     * implies use of the default account encryption scope.
     */
    @JsonProperty(value = "x-ms-encryption-scope")
    private String encryptionScope;

    /**
     * If the blob has a MD5 hash, and if request contains range header (Range
     * or x-ms-range), this response header is returned with the value of the
     * whole blob's MD5 value. This value may or may not be equal to the value
     * returned in Content-MD5 header, with the latter calculated from the
     * requested range
     */
    @JsonProperty(value = "x-ms-blob-content-md5")
    private byte[] blobContentMD5;

    /**
     * If the request is to read a specified range and the
     * x-ms-range-get-content-crc64 is set to true, then the request returns a
     * crc64 for the range, as long as the range size is less than or equal to
     * 4 MB. If both x-ms-range-get-content-crc64 & x-ms-range-get-content-md5
     * is specified in the same request, it will fail with 400(Bad Request)
     */
    @JsonProperty(value = "x-ms-content-crc64")
    private byte[] contentCrc64;

    /**
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the lastModified property: Returns the date and time the container
     * was last modified. Any operation that modifies the blob, including an
     * update of the blob's metadata or properties, changes the last-modified
     * time of the blob.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: Returns the date and time the container
     * was last modified. Any operation that modifies the blob, including an
     * update of the blob's metadata or properties, changes the last-modified
     * time of the blob.
     *
     * @param lastModified the lastModified value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the metadata property: The metadata property.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata property.
     *
     * @param metadata the metadata value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the contentLength property: The number of bytes present in the
     * response body.
     *
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The number of bytes present in the
     * response body.
     *
     * @param contentLength the contentLength value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the contentType property: The media type of the body of the
     * response. For Download Blob this is 'application/octet-stream'.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The media type of the body of the
     * response. For Download Blob this is 'application/octet-stream'.
     *
     * @param contentType the contentType value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentRange property: Indicates the range of bytes returned in
     * the event that the client requested a subset of the blob by setting the
     * 'Range' request header.
     *
     * @return the contentRange value.
     */
    public String getContentRange() {
        return this.contentRange;
    }

    /**
     * Set the contentRange property: Indicates the range of bytes returned in
     * the event that the client requested a subset of the blob by setting the
     * 'Range' request header.
     *
     * @param contentRange the contentRange value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    /**
     * Get the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally. If the request version is 2011-08-18
     * or newer, the ETag value will be in quotes.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally. If the request version is 2011-08-18
     * or newer, the ETag value will be in quotes.
     *
     * @param eTag the eTag value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the contentMd5 property: If the blob has an MD5 hash and this
     * operation is to read the full blob, this response header is returned so
     * that the client can check for message content integrity.
     *
     * @return the contentMd5 value.
     */
    public byte[] getContentMd5() {
        return CoreUtils.clone(this.contentMd5);
    }

    /**
     * Set the contentMd5 property: If the blob has an MD5 hash and this
     * operation is to read the full blob, this response header is returned so
     * that the client can check for message content integrity.
     *
     * @param contentMd5 the contentMd5 value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setContentMd5(byte[] contentMd5) {
        this.contentMd5 = CoreUtils.clone(contentMd5);
        return this;
    }

    /**
     * Get the contentEncoding property: This header returns the value that was
     * specified for the Content-Encoding request header.
     *
     * @return the contentEncoding value.
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: This header returns the value that was
     * specified for the Content-Encoding request header.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the cacheControl property: This header is returned if it was
     * previously specified for the blob.
     *
     * @return the cacheControl value.
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: This header is returned if it was
     * previously specified for the blob.
     *
     * @param cacheControl the cacheControl value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Get the contentDisposition property: This header returns the value that
     * was specified for the 'x-ms-blob-content-disposition' header. The
     * Content-Disposition response header field conveys additional information
     * about how to process the response payload, and also can be used to
     * attach additional metadata. For example, if set to attachment, it
     * indicates that the user-agent should not display the response, but
     * instead show a Save As dialog with a filename other than the blob name
     * specified.
     *
     * @return the contentDisposition value.
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: This header returns the value that
     * was specified for the 'x-ms-blob-content-disposition' header. The
     * Content-Disposition response header field conveys additional information
     * about how to process the response payload, and also can be used to
     * attach additional metadata. For example, if set to attachment, it
     * indicates that the user-agent should not display the response, but
     * instead show a Save As dialog with a filename other than the blob name
     * specified.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the contentLanguage property: This header returns the value that was
     * specified for the Content-Language request header.
     *
     * @return the contentLanguage value.
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: This header returns the value that was
     * specified for the Content-Language request header.
     *
     * @param contentLanguage the contentLanguage value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the blobSequenceNumber property: The current sequence number for a
     * page blob. This header is not returned for block blobs or append blobs.
     *
     * @return the blobSequenceNumber value.
     */
    public Long getBlobSequenceNumber() {
        return this.blobSequenceNumber;
    }

    /**
     * Set the blobSequenceNumber property: The current sequence number for a
     * page blob. This header is not returned for block blobs or append blobs.
     *
     * @param blobSequenceNumber the blobSequenceNumber value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setBlobSequenceNumber(Long blobSequenceNumber) {
        this.blobSequenceNumber = blobSequenceNumber;
        return this;
    }

    /**
     * Get the blobType property: The blob's type. Possible values include:
     * 'BlockBlob', 'PageBlob', 'AppendBlob'.
     *
     * @return the blobType value.
     */
    public BlobType getBlobType() {
        return this.blobType;
    }

    /**
     * Set the blobType property: The blob's type. Possible values include:
     * 'BlockBlob', 'PageBlob', 'AppendBlob'.
     *
     * @param blobType the blobType value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setBlobType(BlobType blobType) {
        this.blobType = blobType;
        return this;
    }

    /**
     * Get the copyCompletionTime property: Conclusion time of the last
     * attempted Copy Blob operation where this blob was the destination blob.
     * This value can specify the time of a completed, aborted, or failed copy
     * attempt. This header does not appear if a copy is pending, if this blob
     * has never been the destination in a Copy Blob operation, or if this blob
     * has been modified after a concluded Copy Blob operation using Set Blob
     * Properties, Put Blob, or Put Block List.
     *
     * @return the copyCompletionTime value.
     */
    public OffsetDateTime getCopyCompletionTime() {
        if (this.copyCompletionTime == null) {
            return null;
        }
        return this.copyCompletionTime.getDateTime();
    }

    /**
     * Set the copyCompletionTime property: Conclusion time of the last
     * attempted Copy Blob operation where this blob was the destination blob.
     * This value can specify the time of a completed, aborted, or failed copy
     * attempt. This header does not appear if a copy is pending, if this blob
     * has never been the destination in a Copy Blob operation, or if this blob
     * has been modified after a concluded Copy Blob operation using Set Blob
     * Properties, Put Blob, or Put Block List.
     *
     * @param copyCompletionTime the copyCompletionTime value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setCopyCompletionTime(OffsetDateTime copyCompletionTime) {
        if (copyCompletionTime == null) {
            this.copyCompletionTime = null;
        } else {
            this.copyCompletionTime = new DateTimeRfc1123(copyCompletionTime);
        }
        return this;
    }

    /**
     * Get the copyStatusDescription property: Only appears when
     * x-ms-copy-status is failed or pending. Describes the cause of the last
     * fatal or non-fatal copy operation failure. This header does not appear
     * if this blob has never been the destination in a Copy Blob operation, or
     * if this blob has been modified after a concluded Copy Blob operation
     * using Set Blob Properties, Put Blob, or Put Block List.
     *
     * @return the copyStatusDescription value.
     */
    public String getCopyStatusDescription() {
        return this.copyStatusDescription;
    }

    /**
     * Set the copyStatusDescription property: Only appears when
     * x-ms-copy-status is failed or pending. Describes the cause of the last
     * fatal or non-fatal copy operation failure. This header does not appear
     * if this blob has never been the destination in a Copy Blob operation, or
     * if this blob has been modified after a concluded Copy Blob operation
     * using Set Blob Properties, Put Blob, or Put Block List.
     *
     * @param copyStatusDescription the copyStatusDescription value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setCopyStatusDescription(String copyStatusDescription) {
        this.copyStatusDescription = copyStatusDescription;
        return this;
    }

    /**
     * Get the copyId property: String identifier for this copy operation. Use
     * with Get Blob Properties to check the status of this copy operation, or
     * pass to Abort Copy Blob to abort a pending copy.
     *
     * @return the copyId value.
     */
    public String getCopyId() {
        return this.copyId;
    }

    /**
     * Set the copyId property: String identifier for this copy operation. Use
     * with Get Blob Properties to check the status of this copy operation, or
     * pass to Abort Copy Blob to abort a pending copy.
     *
     * @param copyId the copyId value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setCopyId(String copyId) {
        this.copyId = copyId;
        return this;
    }

    /**
     * Get the copyProgress property: Contains the number of bytes copied and
     * the total bytes in the source in the last attempted Copy Blob operation
     * where this blob was the destination blob. Can show between 0 and
     * Content-Length bytes copied. This header does not appear if this blob
     * has never been the destination in a Copy Blob operation, or if this blob
     * has been modified after a concluded Copy Blob operation using Set Blob
     * Properties, Put Blob, or Put Block List.
     *
     * @return the copyProgress value.
     */
    public String getCopyProgress() {
        return this.copyProgress;
    }

    /**
     * Set the copyProgress property: Contains the number of bytes copied and
     * the total bytes in the source in the last attempted Copy Blob operation
     * where this blob was the destination blob. Can show between 0 and
     * Content-Length bytes copied. This header does not appear if this blob
     * has never been the destination in a Copy Blob operation, or if this blob
     * has been modified after a concluded Copy Blob operation using Set Blob
     * Properties, Put Blob, or Put Block List.
     *
     * @param copyProgress the copyProgress value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setCopyProgress(String copyProgress) {
        this.copyProgress = copyProgress;
        return this;
    }

    /**
     * Get the copySource property: URL up to 2 KB in length that specifies the
     * source blob or file used in the last attempted Copy Blob operation where
     * this blob was the destination blob. This header does not appear if this
     * blob has never been the destination in a Copy Blob operation, or if this
     * blob has been modified after a concluded Copy Blob operation using Set
     * Blob Properties, Put Blob, or Put Block List.
     *
     * @return the copySource value.
     */
    public String getCopySource() {
        return this.copySource;
    }

    /**
     * Set the copySource property: URL up to 2 KB in length that specifies the
     * source blob or file used in the last attempted Copy Blob operation where
     * this blob was the destination blob. This header does not appear if this
     * blob has never been the destination in a Copy Blob operation, or if this
     * blob has been modified after a concluded Copy Blob operation using Set
     * Blob Properties, Put Blob, or Put Block List.
     *
     * @param copySource the copySource value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setCopySource(String copySource) {
        this.copySource = copySource;
        return this;
    }

    /**
     * Get the copyStatus property: State of the copy operation identified by
     * x-ms-copy-id. Possible values include: 'pending', 'success', 'aborted',
     * 'failed'.
     *
     * @return the copyStatus value.
     */
    public CopyStatusType getCopyStatus() {
        return this.copyStatus;
    }

    /**
     * Set the copyStatus property: State of the copy operation identified by
     * x-ms-copy-id. Possible values include: 'pending', 'success', 'aborted',
     * 'failed'.
     *
     * @param copyStatus the copyStatus value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setCopyStatus(CopyStatusType copyStatus) {
        this.copyStatus = copyStatus;
        return this;
    }

    /**
     * Get the leaseDuration property: When a blob is leased, specifies whether
     * the lease is of infinite or fixed duration. Possible values include:
     * 'infinite', 'fixed'.
     *
     * @return the leaseDuration value.
     */
    public LeaseDurationType getLeaseDuration() {
        return this.leaseDuration;
    }

    /**
     * Set the leaseDuration property: When a blob is leased, specifies whether
     * the lease is of infinite or fixed duration. Possible values include:
     * 'infinite', 'fixed'.
     *
     * @param leaseDuration the leaseDuration value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setLeaseDuration(LeaseDurationType leaseDuration) {
        this.leaseDuration = leaseDuration;
        return this;
    }

    /**
     * Get the leaseState property: Lease state of the blob. Possible values
     * include: 'available', 'leased', 'expired', 'breaking', 'broken'.
     *
     * @return the leaseState value.
     */
    public LeaseStateType getLeaseState() {
        return this.leaseState;
    }

    /**
     * Set the leaseState property: Lease state of the blob. Possible values
     * include: 'available', 'leased', 'expired', 'breaking', 'broken'.
     *
     * @param leaseState the leaseState value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setLeaseState(LeaseStateType leaseState) {
        this.leaseState = leaseState;
        return this;
    }

    /**
     * Get the leaseStatus property: The current lease status of the blob.
     * Possible values include: 'locked', 'unlocked'.
     *
     * @return the leaseStatus value.
     */
    public LeaseStatusType getLeaseStatus() {
        return this.leaseStatus;
    }

    /**
     * Set the leaseStatus property: The current lease status of the blob.
     * Possible values include: 'locked', 'unlocked'.
     *
     * @param leaseStatus the leaseStatus value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setLeaseStatus(LeaseStatusType leaseStatus) {
        this.leaseStatus = leaseStatus;
        return this;
    }

    /**
     * Get the clientRequestId property: If a client request id header is sent
     * in the request, this header will be present in the response with the
     * same value.
     *
     * @return the clientRequestId value.
     */
    public String getClientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: If a client request id header is sent
     * in the request, this header will be present in the response with the
     * same value.
     *
     * @param clientRequestId the clientRequestId value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @param requestId the requestId value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the Blob service used
     * to execute the request. This header is returned for requests made
     * against version 2009-09-19 and above.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the Blob service used
     * to execute the request. This header is returned for requests made
     * against version 2009-09-19 and above.
     *
     * @param version the version value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the acceptRanges property: Indicates that the service supports
     * requests for partial blob content.
     *
     * @return the acceptRanges value.
     */
    public String getAcceptRanges() {
        return this.acceptRanges;
    }

    /**
     * Set the acceptRanges property: Indicates that the service supports
     * requests for partial blob content.
     *
     * @param acceptRanges the acceptRanges value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
        return this;
    }

    /**
     * Get the dateProperty property: UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the blobCommittedBlockCount property: The number of committed blocks
     * present in the blob. This header is returned only for append blobs.
     *
     * @return the blobCommittedBlockCount value.
     */
    public Integer getBlobCommittedBlockCount() {
        return this.blobCommittedBlockCount;
    }

    /**
     * Set the blobCommittedBlockCount property: The number of committed blocks
     * present in the blob. This header is returned only for append blobs.
     *
     * @param blobCommittedBlockCount the blobCommittedBlockCount value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setBlobCommittedBlockCount(Integer blobCommittedBlockCount) {
        this.blobCommittedBlockCount = blobCommittedBlockCount;
        return this;
    }

    /**
     * Get the isServerEncrypted property: The value of this header is set to
     * true if the blob data and application metadata are completely encrypted
     * using the specified algorithm. Otherwise, the value is set to false
     * (when the blob is unencrypted, or if only parts of the blob/application
     * metadata are encrypted).
     *
     * @return the isServerEncrypted value.
     */
    public Boolean isServerEncrypted() {
        return this.isServerEncrypted;
    }

    /**
     * Set the isServerEncrypted property: The value of this header is set to
     * true if the blob data and application metadata are completely encrypted
     * using the specified algorithm. Otherwise, the value is set to false
     * (when the blob is unencrypted, or if only parts of the blob/application
     * metadata are encrypted).
     *
     * @param isServerEncrypted the isServerEncrypted value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setIsServerEncrypted(Boolean isServerEncrypted) {
        this.isServerEncrypted = isServerEncrypted;
        return this;
    }

    /**
     * Get the encryptionKeySha256 property: The SHA-256 hash of the encryption
     * key used to encrypt the blob. This header is only returned when the blob
     * was encrypted with a customer-provided key.
     *
     * @return the encryptionKeySha256 value.
     */
    public String getEncryptionKeySha256() {
        return this.encryptionKeySha256;
    }

    /**
     * Set the encryptionKeySha256 property: The SHA-256 hash of the encryption
     * key used to encrypt the blob. This header is only returned when the blob
     * was encrypted with a customer-provided key.
     *
     * @param encryptionKeySha256 the encryptionKeySha256 value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setEncryptionKeySha256(String encryptionKeySha256) {
        this.encryptionKeySha256 = encryptionKeySha256;
        return this;
    }

    /**
     * Get the encryptionScope property: Returns the name of the encryption
     * scope used to encrypt the blob contents and application metadata.  Note
     * that the absence of this header implies use of the default account
     * encryption scope.
     *
     * @return the encryptionScope value.
     */
    public String getEncryptionScope() {
        return this.encryptionScope;
    }

    /**
     * Set the encryptionScope property: Returns the name of the encryption
     * scope used to encrypt the blob contents and application metadata.  Note
     * that the absence of this header implies use of the default account
     * encryption scope.
     *
     * @param encryptionScope the encryptionScope value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setEncryptionScope(String encryptionScope) {
        this.encryptionScope = encryptionScope;
        return this;
    }

    /**
     * Get the blobContentMD5 property: If the blob has a MD5 hash, and if
     * request contains range header (Range or x-ms-range), this response
     * header is returned with the value of the whole blob's MD5 value. This
     * value may or may not be equal to the value returned in Content-MD5
     * header, with the latter calculated from the requested range.
     *
     * @return the blobContentMD5 value.
     */
    public byte[] getBlobContentMD5() {
        return CoreUtils.clone(this.blobContentMD5);
    }

    /**
     * Set the blobContentMD5 property: If the blob has a MD5 hash, and if
     * request contains range header (Range or x-ms-range), this response
     * header is returned with the value of the whole blob's MD5 value. This
     * value may or may not be equal to the value returned in Content-MD5
     * header, with the latter calculated from the requested range.
     *
     * @param blobContentMD5 the blobContentMD5 value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setBlobContentMD5(byte[] blobContentMD5) {
        this.blobContentMD5 = CoreUtils.clone(blobContentMD5);
        return this;
    }

    /**
     * Get the contentCrc64 property: If the request is to read a specified
     * range and the x-ms-range-get-content-crc64 is set to true, then the
     * request returns a crc64 for the range, as long as the range size is less
     * than or equal to 4 MB. If both x-ms-range-get-content-crc64 &amp;
     * x-ms-range-get-content-md5 is specified in the same request, it will
     * fail with 400(Bad Request).
     *
     * @return the contentCrc64 value.
     */
    public byte[] getContentCrc64() {
        return CoreUtils.clone(this.contentCrc64);
    }

    /**
     * Set the contentCrc64 property: If the request is to read a specified
     * range and the x-ms-range-get-content-crc64 is set to true, then the
     * request returns a crc64 for the range, as long as the range size is less
     * than or equal to 4 MB. If both x-ms-range-get-content-crc64 &amp;
     * x-ms-range-get-content-md5 is specified in the same request, it will
     * fail with 400(Bad Request).
     *
     * @param contentCrc64 the contentCrc64 value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setContentCrc64(byte[] contentCrc64) {
        this.contentCrc64 = CoreUtils.clone(contentCrc64);
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the BlobDownloadHeaders object itself.
     */
    public BlobDownloadHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}

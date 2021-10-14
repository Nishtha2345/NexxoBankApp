package dto;

public class ViewListResponseDto
    {
        private String firstName;
        private String lastName;
        private Integer roleType;
        private Integer status;
        private Integer aadhaarNo;
        private Integer mobileNo;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Integer getRoleType() {
            return roleType;
        }

        public void setRoleType(Integer roleType) {
            this.roleType = roleType;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getAadhaarNo() {
            return aadhaarNo;
        }

        public void setAadhaarNo(Integer aadhaarNo) {
            this.aadhaarNo = aadhaarNo;
        }

        public Integer getMobileNo() {
            return mobileNo;
        }

        public void setMobileNo(Integer mobileNo) {
            this.mobileNo = mobileNo;
        }
    }






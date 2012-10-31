package Domäne;

import java.util.HashSet;
import java.util.Set;


public class FunctionRole implements java.io.Serializable {

    private Integer id;
    private RoleRight roleRight;
    private String name;
    private Set<ClubMember> clubMembers = new HashSet<ClubMember>(0);

    public FunctionRole() {
    }

    public FunctionRole(RoleRight roleRight, String name) {
        this.roleRight = roleRight;
        this.name = name;
    }

    public FunctionRole(RoleRight roleRight, String name, Set<ClubMember> clubMembers) {
        this.roleRight = roleRight;
        this.name = name;
        this.clubMembers = clubMembers;
    }
    
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RoleRight getRoleRight() {
        return this.roleRight;
    }

    public void setRoleRight(RoleRight roleRight) {
        this.roleRight = roleRight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ClubMember> getClubMembers() {
        return this.clubMembers;
    }

    public void setClubMembers(Set<ClubMember> clubMembers) {
        this.clubMembers = clubMembers;
    }
    
}
